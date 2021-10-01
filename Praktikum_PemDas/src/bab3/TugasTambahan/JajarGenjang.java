package bab3.TugasTambahan;

import java.util.Scanner;

public class JajarGenjang {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Masukan n : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}