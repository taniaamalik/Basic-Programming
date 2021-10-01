package bab3.TugasTambahan;

import java.util.Scanner;

public class BinToDec {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal = 0, p = 0;
        System.out.print("Masukkan Binner : ");
        int n = s.nextInt();
        while (n != 0) {
            decimal += ((n % 10) * Math.pow(2, p));
            n = n / 10;
            p++;
        }
        System.out.println("Bilangan Decimal : " + decimal);
    }
}