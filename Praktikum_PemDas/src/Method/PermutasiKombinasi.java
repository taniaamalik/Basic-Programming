package Method;

import java.util.Scanner;

public class PermutasiKombinasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan = 3;
        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    Permutasi();
                    break;
                case 2:
                    Kombinasi();
                    break;
            }
        } while (pilihan != 3);
    }
    public static void Permutasi() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        System.out.print("Masukkan nilai r : ");
        int r = in.nextInt();
        int hsl_n = 1;
        int x = n - r;
        int hsl_x = 1;
        for (int i = n; i > 0; i--) {
            hsl_n *= i;
        }
        for (int i = x; i > 0; i--) {
            hsl_x *= i;
        }
        int permutasi = hsl_n / hsl_x;
        System.out.println("         n!");
        System.out.println("nPr = -------- = " + permutasi);
        System.out.println("       (n-r)!");
        System.out.println("Maka Hasil Permutasinya adalah : " + permutasi + "\n");
    }
    public static void Kombinasi() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        System.out.print("Masukkan nilai r : ");
        int r = in.nextInt();
        int hsl_n = 1;
        int hsl_r = 1;
        int x = n - r;
        int hsl_x = 1;
        for (int i = n; i > 0; i--) {
            hsl_n *= i;
        }
        for (int i = r; i > 0; i--) {
            hsl_r *= i;
        }
        for (int i = x; i > 0; i--) {
            hsl_x *= i;
        }
        int kombinasi = hsl_n / (hsl_x * hsl_r);
        System.out.println("            n!");
        System.out.println("nCr = ------------- = " + kombinasi);
        System.out.println("       (n-r)! x r!");
        System.out.println("Maka Hasil Kombinasinya adalah : " + kombinasi + "\n");
    }
}