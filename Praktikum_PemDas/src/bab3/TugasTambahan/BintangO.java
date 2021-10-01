package bab3.TugasTambahan;

import java.util.Scanner;

public class BintangO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan n : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print("O");
            }
            System.out.println("");
        }
    }
}