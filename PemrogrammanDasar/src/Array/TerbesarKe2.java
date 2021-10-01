package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TerbesarKe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Jumlah Array : ");
        int jmlh_array = in.nextInt();
        int[] nilai = new int[jmlh_array];
        for (int i = 0; i < jmlh_array; i++) {
            System.out.print("Masukan Angka ke-" + (i + 1) + "=");
            int angka = in.nextInt();
            nilai[i] = angka;
        }
            System.out.println("");
        int terbesar = Integer.MIN_VALUE;
        int terbesar2 = Integer.MIN_VALUE;
        for (int i = 0; i < jmlh_array; i++) {
            if (nilai[i] > terbesar) {
                terbesar2 = terbesar;
                terbesar = nilai[i];
            }
        }
        for (int i = 0; i < jmlh_array; i++) {
            if (nilai[i] != terbesar && nilai[i] > terbesar2) {
                    terbesar2 = nilai[i];
                }
            }
        System.out.println("=====================");
        System.out.println("Angka terbesar ke-2 : " + terbesar2);
    }
}