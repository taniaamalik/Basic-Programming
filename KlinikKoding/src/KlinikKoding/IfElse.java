package KlinikKoding;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;
        System.out.print("Masukan Angka : ");
        angka = in.nextInt();
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (angka % 3 == 0) {
            System.out.println("Fizz");
        } else if (angka % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(angka);
        }
    }
}