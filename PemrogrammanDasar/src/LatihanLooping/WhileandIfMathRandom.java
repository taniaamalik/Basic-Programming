package LatihanLooping;

import java.util.Scanner;

public class WhileandIfMathRandom {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        System.out.println("Tebak angka antara 1 dan 100");
        System.out.println("Tebak Angka : ");
        int angka = input.nextInt();
        while (angka != number) {
            if (angka > number) {
                System.out.println("Terlalu tinggi");
                angka = input.nextInt();
            }
            if (angka < number) {
                System.out.println("Terlalu rendah");
                angka = input.nextInt();
            }
        }
        System.out.println("Jawaban Benar");
    }
}