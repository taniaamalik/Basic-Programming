package coba;

import java.util.Scanner;

public class NilaiTerbesar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int terbesar1 = 0, terbesar2 = 0, terbesar3 = 0;
        System.out.print("a : ");
        int a = in.nextInt();
        System.out.print("b : ");
        int b = in.nextInt();
        System.out.print("c : ");
        int c = in.nextInt();
        if (a > b) {
            if (a > c && c > b) {
                terbesar1 = a;
                terbesar2 = c;
                terbesar3 = b;
            } else if (a > c && b > c) {
                terbesar1 = a;
                terbesar2 = b;
                terbesar3 = c;
            } else {
                terbesar1 = c;
                terbesar2 = a;
                terbesar3 = b;
            }
        } else {
            if (b > c && a > c) {
                terbesar1 = b;
                terbesar2 = a;
                terbesar3 = c;
            } else if (b > c && c > a) {
                terbesar1 = b;
                terbesar2 = c;
                terbesar3 = a;
            } else {
                terbesar1 = c;
                terbesar2 = b;
                terbesar3 = a;
            }
        }
        System.out.println("tebesar 1 = " + terbesar1);
        System.out.println("tebesar 2 = " + terbesar2);
        System.out.println("tebesar 3 = " + terbesar3);
    }
}