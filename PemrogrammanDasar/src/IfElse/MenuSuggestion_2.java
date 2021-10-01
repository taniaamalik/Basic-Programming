package IfElse;

import java.time.LocalDateTime;

public class MenuSuggestion_2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int date = now.getDayOfMonth();
        String month = now.getMonth().name();
        System.out.print("Today is " + date + " of " + month + ',');
        if (date >= 1 && date <= 10) {
            System.out.println(" menu sugestion is pizza");
        } else if (date >= 11 && date <= 20) {
            System.out.println(" menu suggestion is nasi padang");
        } else {
            System.out.println(" menu suggestion is indomie");
        }
    }
}