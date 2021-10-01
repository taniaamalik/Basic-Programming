package bab3.TugasTambahan;

import java.util.Scanner;

public class PosisiKata {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = in.nextLine();
        System.out.print("Input : ");
        String cari = in.nextLine();
        for (int i = 0; i < kata.length(); i++) {
            String subkata = kata.substring(i, i + 1);
            if (cari.equals(subkata)) {
                System.out.println("Posisi : " + (i + 1));
            }
        }
    }
}