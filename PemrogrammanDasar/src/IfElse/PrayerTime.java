package IfElse;

import java.time.LocalDateTime;

public class PrayerTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if (hour >= 4 && hour < 12) {
            System.out.println("The next prayer time is dhuhur");
        } else if (hour >= 12 && hour < 15) {
            System.out.println("The next prayer time is ashar");
        } else if (hour >= 15 && hour < 18) {
            System.out.println("The next prayer time is maghrib");
        } else if (hour >= 18 && hour < 19) {
            System.out.println("The next prayer time is isya");
        } else {
            System.out.println("The next prayer time is subuh");
        }
    }
}