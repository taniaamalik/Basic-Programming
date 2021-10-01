package myproject;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Filkom_Ojol {

    public static void main(String[] args) throws UnirestException {
        Scanner in = new Scanner(System.in);
        String p, d, origin, destination;
        System.out.print("Your pickup : ");
        p = in.nextLine();
        origin = p.replace(" ", "%20");
        System.out.print("Your destination : ");
        d = in.nextLine();
        destination = d.replace(" ", "%20");
        String url = String.format("https://maps.googleapis.com/maps/api/distancematrix/json?units=kilometers&origins=%s&destinations=%s&key=AIzaSyCCi3PFF3XevYnva9AKEo-p3HJ7EHeUXpo", origin, destination);
        JsonNode json = Unirest.get(url).asJson().getBody();
        String distanceString = json
                .getObject()
                .getJSONArray("rows")
                .getJSONObject(0)
                .getJSONArray("elements")
                .getJSONObject(0)
                .getJSONObject("distance")
                .getString("text");
        distanceString = distanceString.substring(0, distanceString.length() - 3);
        float distance = Float.valueOf(distanceString);
        System.out.println("Distance : " + distance);
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour(); 
        int methods, cost;
        int basefare = 3000;
        int fare1 = 2500;
        int fare2 = 3500;
        int discount = 2000;
        System.out.println("1. CASH");
        System.out.println("2. FILKOM-PAY");
        System.out.print("Add Payment Methods : ");
        methods = in.nextInt();
        if (methods == 1) {
            if (hour >= 6 && hour <= 21) {
                cost = (int) (basefare + (fare1 * distance)); 
            } else {
                cost = (int) (basefare + (fare2 * distance));
            }
            if (cost < 10000) {
                cost = 10000;
            }
            System.out.println("Total : RP " + cost);
        }
        if (methods == 2) {
            if (hour >= 6 && hour <= 21) {
                cost = (int) (basefare + (fare1 * distance) - discount);
            } else {
                cost = (int) (basefare + (fare2 * distance) - discount); 
            }
            if (cost < 10000) {
                cost = 10000-discount;
            }
            System.out.println("Total : RP " + cost);
        }
    }
}