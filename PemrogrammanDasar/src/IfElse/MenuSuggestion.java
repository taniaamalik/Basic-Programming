package IfElse;

import java.time.LocalDateTime;

public class MenuSuggestion {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int date = now.getDayOfMonth();
        String month = now.getMonth().name();
        if (date >= 1 && date <= 10) {
            System.out.println("Today is " + date + " of " + month + ',' + " menu sugestion is pizza");
        } else if (date >= 11 && date <= 20) {
            System.out.println("Today is " + date + " of " + month + ',' + " menu suggestion is nasi padang");
        } else {
            System.out.println("Today is " + date + " of " + month + ',' + " menu suggestion is indomie");
        }
    }
}