package coba;

import java.util.Scanner;

public class BilPrima {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Angka : ");
        int a = in.nextInt();
        nentuinBilPrima(a);
        BilPrima();

    }

    public static void nentuinBilPrima(int a) {
        int temp = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                temp++;
            }
        }
        if (temp == 1) {
            System.out.println("Bilangan " + a + " termasuk bilangan prima");
        } else {
            System.out.println("Bilangan " + a + " termasuk bukan bilangan prima");
        }
    }

    public static void BilPrima() {
        System.out.println("Menentukan bil prima 1-100");
        for (int i = 1; i < 100; i++) {
            int x = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i != j) {
                        x = 1;
                    }
                    if (i == j && x != 1) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
        System.out.println();
    }
}