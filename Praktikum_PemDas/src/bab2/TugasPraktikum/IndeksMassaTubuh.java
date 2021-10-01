package bab2.TugasPraktikum;

import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b, t, IMT;
        System.out.print("Berat badan (kg) : ");
        b = input.nextDouble();
        System.out.print("Tinggi badan (m) : ");
        t = input.nextDouble();
        IMT = b / (t * t);
        System.out.printf("%s%.2f", "IMT = ", IMT);
        if (IMT <= 18.5) {
            System.out.println("\t\tTermasuk kurus");
        } else if (IMT > 18.5 && IMT <= 25) {
            System.out.println("\t\tTermasuk normal");
        } else if (IMT > 25 && IMT <= 30) {
            System.out.println("\t\tTermasuk gemuk");
        } else {
            System.out.println("\t\tTermasuk kegemukan");
        }
    }
}