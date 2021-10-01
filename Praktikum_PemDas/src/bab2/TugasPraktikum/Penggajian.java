package bab2.TugasPraktikum;

import java.util.Scanner;

public class Penggajian {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jam Kerja : ");
        int jamkerja = input.nextInt();
        int jam, upah, denda, total;
        int lembur = 0;
        if (jamkerja > 60) {
            upah = 60 * 5000;
            lembur = (jamkerja - 60) * 6000;
        } else {
            upah = jamkerja * 5000;
        }
        if (jamkerja < 50) {
            upah = jamkerja * 5000;
            denda = (50 - jamkerja) * 1000;
        } else {
            denda = 0;
        }
        total = upah + lembur - denda;
        System.out.println("Upah\t= Rp. " + upah);
        System.out.println("Lembur\t= Rp. " + lembur);
        System.out.println("Denda\t= Rp. " + denda);
        System.out.println("---------------------");
        System.out.println("Total\t= Rp. " + total);
    }
}