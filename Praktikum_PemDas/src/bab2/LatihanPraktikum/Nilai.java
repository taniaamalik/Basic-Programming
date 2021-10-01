package bab2.LatihanPraktikum;

import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        float nilai_kuis, nilai_UAS, nilai_tugas, NilaiAkhir;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nilai Kuis : ");
        nilai_kuis = in.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        nilai_UAS = in.nextFloat();
        System.out.print("Masukkan Nilai Tugas : ");
        nilai_tugas = in.nextFloat();
        if (nilai_kuis > nilai_UAS) {
            NilaiAkhir = (float) ((0.4 * nilai_kuis) + (0.4 * nilai_UAS) + (0.2 * nilai_tugas));
            System.out.println("Nilai Akhir : " + NilaiAkhir);
        } else {
            NilaiAkhir = (float) ((0.3 * nilai_kuis) + (0.5 * nilai_UAS) + (0.2 * nilai_tugas));
            System.out.println("Nilai Akhir : " + NilaiAkhir);
        }

        if (NilaiAkhir >= 85 && NilaiAkhir <= 100) {
            System.out.println("Bobot : 4");
            System.out.println("A (Sangat Baik)");
        } else if (NilaiAkhir >= 75 && NilaiAkhir <= 84) {
            System.out.println("Bobot : 3");
            System.out.println("B (Baik)");
        } else if (NilaiAkhir >= 65 && NilaiAkhir <= 74) {
            System.out.println("Bobot : 2");
            System.out.println("C (Cukup)");
        } else if (NilaiAkhir >= 50 && NilaiAkhir <= 64) {
            System.out.println("Bobot : 1");
            System.out.println("D (Kurang)");
        } else {
            System.out.println("Bobot : 0");
            System.out.println("E (Gagal)");
        }
    }
}