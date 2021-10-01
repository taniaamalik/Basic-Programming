package bab2;

import java.util.Scanner;

public class ConstAss_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama\t  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Password : ");
        String pass = input.nextLine();
        String biodata = ("Tania".equals(nama)) && ("123".equals(pass))
                ? "BIODATA MAHASISWA :\n"
                + "Nama\t= Tania Malik Iryana\n"
                + "NIM\t= 175150201111053\n"
                + "TTL\t= Bekasi, 15 Desember 1999\n"
                + "Kelas\t= D\n"
                + "Fakultas= Ilmu Komputer\n"
                + "Jurusan\t= Teknik Informatika\n"
                + "Prodi\t= Teknik Informatika"
                : "data tak ditemukan";
        System.out.println(biodata);
    }
}