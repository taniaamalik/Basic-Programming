package coba2;

import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = 0;
        System.out.print("Masukkan nilai : ");
        nilai = input.nextInt();
        System.out.println("Nilai = " + nilai % 2);
    }
}