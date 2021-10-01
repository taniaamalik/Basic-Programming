package coba2;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata2 = "";
        System.out.print("Masukan Kata : ");
        String k = in.nextLine();
        String[] kata = new String[k.length()];
        for (int i = k.length(); i >= 1; i--) {
            kata[i-1] = k.substring(i -1, i);
            kata2 = kata2 + kata[i-1];
        }
            if (kata2.equals(k)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
            
    }
}
