package coba;

import java.util.Scanner;

public class coba {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai = 100000000;
        while (nilai > 1) {
            System.out.println(nilai);
            nilai = nilai / 10;
        }
    }
}