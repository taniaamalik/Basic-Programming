package bab2.TugasPraktikum;

import java.util.Scanner;

public class LuasKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double keliling, luas, p, l, r, t, a, b;
        double phi = 3.14;
        int pilihan=0;
        System.out.println("Menu : ");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukan p : ");
                p = input.nextDouble();
                System.out.print("Masukan l : ");
                l = input.nextDouble();
                keliling = 2 * (p + l);
                luas = p * l;
                System.out.println("Keliling persegi panjang : " + keliling + " cm");
                System.out.println("Luas persegi panjang : " + luas + " cm²");
                break;
            case 2:
                System.out.print("Masukan r : ");
                r = input.nextDouble();
                keliling = 2 * phi * r;
                luas = phi * r * r;
                System.out.println("Keliling lingkaran : " + keliling + " cm");
                System.out.println("Luas lingkaran : " + luas + " cm²");
                break;
            case 3:
                System.out.print("Masukan alas : ");
                a = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                b = input.nextDouble();
                System.out.print("Masukan sisi miring : ");
                r = input.nextDouble();
                keliling = a + b + r;
                luas = a * b / 2;
                System.out.println("Keliling segitiga : " + keliling + " cm");
                System.out.println("Luas segitiga : " + luas + " cm²");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
        }
    }
}