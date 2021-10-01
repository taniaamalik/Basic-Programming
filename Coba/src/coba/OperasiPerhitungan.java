package coba;

import java.util.Arrays;
import java.util.Scanner;

public class OperasiPerhitungan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Jumlah Array : ");
        int jmlh = in.nextInt();
        int[] arr = new int[jmlh];
        for (int i = 0; i < 10;) {
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Keluar");
            System.out.print("Masukkan nilai : ");
            int n = in.nextInt();
            switch (n) {
                case 1:
                    for (int j = 0; j < jmlh; j++) {
                        System.out.println("Masukan Data ke-" + (j + 1) + "= ");
                        int data = in.nextInt();
                        arr[j] = data;
                    }
                    break;
                case 2:
                    System.out.println("Data = " + Arrays.toString(arr));
                    break;
                case 3:
                    for (int j = 0; j < jmlh; j++) {
                        sum += arr[j];
                    }
                    double average = (double) sum / jmlh;
                    System.out.println("Average = " + average);
                    break;
                case 4:
                    System.out.println("Sum : " + sum);
                    break;
                case 5:
                    int nilaiMax = Integer.MIN_VALUE;
                    for (int j = 0; j < jmlh; j++) {
                        if (arr[j] > nilaiMax) {
                            nilaiMax = arr[j];
                        }
                    }
                    System.out.println("Max : " + nilaiMax);
                    break;
                case 6:
                    int nilaiMin = Integer.MAX_VALUE;
                    for (int j = 0; j < jmlh; j++) {
                        if (arr[j] < nilaiMin) {
                            nilaiMin = arr[j];
                        }
                    }
                    System.out.println("Min : " + nilaiMin);
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}