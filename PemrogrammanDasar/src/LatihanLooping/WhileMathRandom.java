package LatihanLooping;

import java.util.Scanner;

public class WhileMathRandom {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.println("Hasil perkalian : " + a + "*" + b + "?" + " ");
        while (input.nextInt() != a * b) {
            System.out.println("Jawaban Salah");
            System.out.println("Hasil perkalian : " + a + "*" + b + "?" + " ");
        }
        System.out.println("Jawaban Benar");
    }
}