package bab2.TugasTambahan;

import java.util.Scanner;

public class Meikarta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        System.out.println("1. Paket Jomblo Sendiri");
        System.out.println("harga : 10000");
        System.out.println("2. Paket Jomblo Berdua");
        System.out.println("harga : 20000");
        System.out.print("Pilihan : ");
        pilihan = in.nextInt();
        if (pilihan == 1) {
            System.out.println("harga : 10000");
        } else if (pilihan == 2) {
            System.out.println("harga : 20000");
        } else {
            System.out.println("Anda memesan paket yang salah");
        }
    }
}