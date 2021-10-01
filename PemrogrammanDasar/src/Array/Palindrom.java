package Array;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String subk2 = "";
        System.out.print("Masukan kata : ");
        String kata = in.nextLine();
        char[] subk = kata.toCharArray();
        for (int i = kata.length() - 1; i >= 0; i--) {
            subk2 = subk2 + subk[i];
        }
        if (subk2.equals(kata)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}