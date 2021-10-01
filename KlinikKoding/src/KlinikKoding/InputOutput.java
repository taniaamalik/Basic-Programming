package KlinikKoding;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = 0;
        System.out.print("Masukan nilai : ");
        nilai = input.nextInt();
        System.out.println("Nilai = " + nilai);
    }
}