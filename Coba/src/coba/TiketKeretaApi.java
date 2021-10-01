package coba;

import java.util.Arrays;
import java.util.Scanner;

public class TiketKeretaApi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double harga, diskon, totaldiskon, totalbayar = 0;
        int jumlah = 0;
        String jenis = null;
        String[][] kereta = {{"Jenis", "Harga", "Diskon", "AC", "Colokan"}, {"Ekonomi", "50000", "2%", "Tidak ada", "Tidak ada"}, {"Bisnis", "100000", "5%", "Ada", "Tidak ada"}, {"Eksekutif", "200000", "7%", "Ada", "Tidak ada"}, {"Pariwisata", "300000", "10%", "Ada", "Ada"}};
        for (int i = 0; i < 10;) {
            System.out.println("Menu : ");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.print("Masukkan nilai : ");
            int n = in.nextInt();
            switch (n) {
                case 1:
                    for (int j = 0; j < kereta.length; j++) {
                        for (int k = 0; k < kereta.length; k++) {
                            System.out.printf("%-10s%c", kereta[j][k], '|');
                        }
                        System.out.println();
                        System.out.println("-------------------------------------------------------");
                    }
                    break;
                case 2:
                    for (int j = 0; j < kereta.length; j++) {
                        if (j == 1) {
                            continue;
                        }
                        for (int k = 0; k < kereta.length; k++) {
                            System.out.printf("%-10s%c", kereta[j][k], '|');
                        }
                        System.out.println();
                        System.out.println("-------------------------------------------------------");
                    }
                    break;
                case 3:
                    for (int j = 0; j < kereta.length; j++) {
                        if (j > 0 && j < 4) {
                            continue;
                        }
                        for (int k = 0; k < kereta.length; k++) {
                            System.out.printf("%-10s%c", kereta[j][k], '|');
                        }
                        System.out.println();
                        System.out.println("-------------------------------------------------------");
                    }
                    break;
                case 4:
                    in.nextLine();
                    System.out.print("Masukan Jenis Kereta Api: ");
                    jenis = in.nextLine();
                    System.out.print("Masukan Jumlah ticket: ");
                    jumlah = in.nextInt();
                    if (jenis.equalsIgnoreCase("Ekonomi")) {
                        jenis = kereta[1][0];
                        harga = 50000;
                        diskon = 0.02;
                        totaldiskon = (harga * jumlah) * diskon;
                        totalbayar = (harga * jumlah) - totaldiskon;
                        System.out.println("total : " + totalbayar);
                    }
                    break;
                case 5:
                    System.out.printf("%s\t%s\t%s\t\n%-16s%-24s%s", "Jenis Kereta", "Jumlah Penumpang", "Harga Ticket", jenis, jumlah, totalbayar);
                    System.out.println();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}