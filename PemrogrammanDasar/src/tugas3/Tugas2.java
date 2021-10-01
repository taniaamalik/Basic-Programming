package tugas3;

import java.util.Scanner;
public class Tugas2 {
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
            int terbesar = Integer.MIN_VALUE;
            for (int i = 0; i < jmlh_array ; i++) {
                if(nilai[i] > terbesar ){
                    terbesar = nilai[i];
                }
            }
            int terbesar2 = Integer.MIN_VALUE;
            for (int i = 0; i < jmlh_array ; i++) {
                if(nilai[i]!=terbesar){
                    if(terbesar2<terbesar){
                      terbesar2 = nilai[i];
                    }
                }
                    }
            System.out.println("=====================");
                   System.out.println("Angka terbesar ke-2 : " + terbesar2);
       }
    }
