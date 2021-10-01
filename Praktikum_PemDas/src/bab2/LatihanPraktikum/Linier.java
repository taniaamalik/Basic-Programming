package bab2.LatihanPraktikum;

import java.util.Scanner;

public class Linier {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        double X, Y;
        Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM PERHITUNGAN NILAI X DAN Y DARI 2 PERS. LINIER : ");
        System.out.println("    aX + bY = c dan dX + eY = f");
        System.out.println("==================================================================");
        System.out.print("Masukkan nilai a = ");
        a = in.nextInt();
        System.out.print("Masukkan nilai b = ");
        b = in.nextInt();
        System.out.print("Masukkan nilai c = ");
        c = in.nextInt();
        System.out.print("Masukkan nilai d = ");
        d = in.nextInt();
        System.out.print("Masukkan nilai e = ");
        e = in.nextInt();
        System.out.print("Masukkan nilai f = ");
        f = in.nextInt();
        System.out.println("==================================================================");
        System.out.println("Nilai X dan Y dari persamaan linier:");
        X = (double) (c * e - f * b) / (a * e - d * b);
        Y = ((c * e) - (a * e * X)) / (b * e);
        if (b < 0 && e < 0) {
            System.out.printf("%d%s%d%s%d%s%d%s%d%s%d\n", a, " X - ", (-b), " Y = ", c, " dan ", d, " X - ", (-e), " Y = ", f);
        } else if (b < 0) {
            System.out.printf("%d%s%d%s%d%s%d%s%d%s%d\n", a, " X - ", (-b), " Y = ", c, " dan ", d, " X + ", (e), " Y = ", f);
        } else if (e < 0) {
            System.out.printf("%d%s%d%s%d%s%d%s%d%s%d\n", a, " X + ", b, " Y = ", c, " dan ", d, " X - ", (-e), " Y = ", f);
        } else {
            System.out.printf("%d%s%d%s%d%s%d%s%d%s%d\n", a, " X + ", b, " Y = ", c, " dan ", d, " X + ", e, " Y = ", f);
        }
        System.out.printf("%s%s%.3f%s%s%.3f\n", "Adalah: ", "X = ", X, " dan ", "Y = ", Y);
    }
}