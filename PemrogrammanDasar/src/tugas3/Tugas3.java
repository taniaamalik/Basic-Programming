package tugas3;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Jumlah Array : ");
        int jmlh_array = in.nextInt();
        int[] nilai = new int[jmlh_array];
        int terbesar = Integer.MIN_VALUE;
        for (int i = 0; i < jmlh_array; i++) {
            System.out.print("Masukan Angka ke-" + (i + 1) + "=");
            int angka = in.nextInt();
            nilai[i] = angka;
        }
                System.out.println("Dibalik menjadi : ");
            for (int dibalik = (jmlh_array - 1); dibalik >= 0; dibalik--) {
                System.out.println(nilai[dibalik]);
            }
    }
}
