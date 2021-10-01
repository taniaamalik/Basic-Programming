package bab1.TugasPraktikum;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operatorpertama, operatorkedua, penjumlahan, pengurangan, perkalian;
        double pembagian;
        System.out.print("Masukkan Operator Pertama : ");
        operatorpertama = in.nextInt();
        System.out.print("Masukkan Operator Kedua\t : ");
        operatorkedua = in.nextInt();
        penjumlahan = operatorpertama + operatorkedua;
        System.out.println("Penjumlahan\t : " + penjumlahan);
        pengurangan = operatorpertama - operatorkedua;
        System.out.println("Pengurangan\t : " + pengurangan);
        perkalian = operatorpertama * operatorkedua;
        System.out.println("Perkalian\t : " + perkalian);
        pembagian = (double) operatorpertama / operatorkedua;
        System.out.println("Pembagian\t : " + pembagian);
    }
}