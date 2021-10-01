import java.util.Arrays;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nilaiRata2;
        int sum = 0;
        System.out.print("Masukan Jumlah Array : ");
        int jmlh_array = in.nextInt();
        int[] array = new int[jmlh_array];
        for (int i = 0; i < 2;) {
            System.out.println("1. Input Data ");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average ");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min ");
            System.out.println("7. Keluar ");
            System.out.print("Masukkan nilai : ");
            int nilai = in.nextInt();
            switch (nilai) {
                case 1:
                    for (int j = 0; j < jmlh_array; j++) {
                        System.out.print("Masukan Angka ke-" + (j + 1) + "=");
                        int angka = in.nextInt();
                        array[j] = angka;
                    }
                    break;
                case 2:
                    System.out.println(Arrays.toString(array));
                    break;
                case 3:
                    for (int j = 0; j < jmlh_array; j++) {
                        sum += array[j];
                    }
                    nilaiRata2 = (double) sum / array.length;
                    System.out.println("Rata-rata : " + nilaiRata2);
                    break;
                case 4:
                    System.out.println("Hasil Penjumlahan: " + sum);
                    break;
                case 5:
                    int terbesar = Integer.MIN_VALUE;
                    for (int j = 0; j < jmlh_array; j++) {
                        if (array[j] > terbesar) {
                            terbesar = array[j];
                        }
                    }
                    System.out.println("Nilai Max : " + terbesar);
                    break;
                case 6:
                    int terkecil = Integer.MAX_VALUE;
                    for (int j = 0; j < jmlh_array; j++) {
                        if (array[j] < terkecil) {
                            terkecil = array[j];
                        }
                    }
                    System.out.println("Nilai Min : " + terkecil);
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}