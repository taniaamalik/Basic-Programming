package Method;

import java.util.Scanner;

public class Prak_void {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 3;
        do {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Luas & Keliling Segitiga Sembarang");
            System.out.println("2. Luas & Keliling Segitiga Siku-Siku");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    segitigaSembarang();
                    break;
                case 2:
                    segitigaSiku();
                    break;
            }
        } while (pilih != 3);
    }

    private static void segitigaSembarang() {
        Scanner in = new Scanner(System.in);
        float a,b,c,s,luas,keliling;
        System.out.print("Masukkan panjang sisi A :");
        a = in.nextFloat();
        System.out.print("Masukkan panjang sisi B :");
        b = in.nextFloat();
        System.out.print("Masukkan panjang sisi C :");
        c = in.nextFloat();
        keliling = a+b+c;
        s=keliling/2;
        luas = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("Luas Segitiga : %.2f\n",luas);
        System.out.printf("Keliling Segitiga : %.2f\n",keliling);
    }

    static void segitigaSiku() {
        Scanner in = new Scanner(System.in);
        float alas,tinggi,sm,luas,keliling;
        System.out.print("Masukkan alas : ");
        alas = in.nextFloat();
        System.out.print("Masukkan tinggi : ");
        tinggi = in.nextFloat();
        sm = (float) Math.sqrt(alas*alas + tinggi*tinggi);
        keliling = alas+tinggi+sm;
        luas = (alas*tinggi)/2;
        System.out.printf("Sisi Miring : %.2f\n",sm);
        System.out.printf("Luas Segitiga : %.2f\n",luas);
        System.out.printf("Keliling Segitiga : %.2f\n",keliling);
    }
}
