package bab3.TugasTambahan;

import java.util.Scanner;

public class BalikKata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata, dibalik = "";
        System.out.print("Masukkan Kata : ");
        kata = in.nextLine();

        System.out.print("Balik kata : ");
        for (int i = kata.length() - 1; i >= 0; i--) {
            System.out.print(kata.charAt(i));
        }
        System.out.println();
    }
}