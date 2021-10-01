package bab1.TugasPraktikum;

import java.util.Scanner;

public class PemakaianListrik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, kelurahan;
        int awalkwh, akhirkwh, biayabeban, ppj, bulanini, tariflistrik, ppj10, totalbayar;
        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.print("Masukkan Nama\t\t\t : ");
        nama = in.nextLine();
        System.out.print("Masukkan Kelurahan\t\t : ");
        kelurahan = in.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter\t : ");
        awalkwh = in.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter\t : ");
        akhirkwh = in.nextInt();
        System.out.print("Masukkan biaya beban saat ini\t : ");
        biayabeban = in.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)\t : ");
        ppj = in.nextInt();
        System.out.println("===================PLN Java===================");
        System.out.println("Masukkan Nama\t\t : " + nama);
        System.out.println("Masukkan Kelurahan\t : " + kelurahan);
        bulanini = akhirkwh - awalkwh;
        System.out.println("Pemakain Bulan Ini\t : " + bulanini + " Kwh Meter");
        tariflistrik = bulanini * biayabeban;
        System.out.println("Tarif Listrik\t\t : " + tariflistrik + ",-");
        ppj10 = tariflistrik * 10 / 100;
        System.out.println("PPJ 10%\t\t\t : " + ppj10 + ",-");
        totalbayar = tariflistrik + ppj10;
        System.out.println("Total Bayar\t\t : " + totalbayar + ",-");
        System.out.println("==============================================");
    }
}