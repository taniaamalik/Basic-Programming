package bab3.TugasPraktikum;

public class Nama {

    public static void main(String[] args) {
        for (int baris = 1; baris <= 33  ; baris++) {
            for (int kolom = 1; kolom <= 5; kolom++) {
                switch (kolom) {
                    case 1:
                        if (baris == 1) {
                            System.out.print("T ");
                        } else if (baris >= 9 && baris <= 12) {
                            System.out.print("A ");
                        } else if (baris >= 15 && baris <= 19) {
                            System.out.print("N ");
                        } else if (baris == 22 || baris == 26) {
                            System.out.print("I ");
                        } else if (baris >= 30 && baris <= 33) {
                            System.out.print("A ");
                        } else {
                            System.out.print("  ");
                        }
                        break;
                    case 2:
                        if (baris == 1) {
                            System.out.print("T ");
                        } else if (baris == 8 || baris == 10) {
                            System.out.print("A ");
                        } else if (baris == 16) {
                            System.out.print("N ");
                        } else if (baris == 22 || baris == 26) {
                            System.out.print("I ");
                        } else if (baris == 29 || baris == 31) {
                            System.out.print("A ");
                        } else {
                            System.out.print("  ");
                        }
                        break;
                    case 3:
                        if (baris >= 1 && baris <= 5) {
                            System.out.print("T ");
                        } else if (baris == 8 || baris == 10) {
                            System.out.print("A ");
                        } else if (baris == 17) {
                            System.out.print("N ");
                        } else if (baris >= 22 && baris <= 26) {
                            System.out.print("I ");
                        } else if (baris == 29 || baris == 31) {
                            System.out.print("A ");
                        } else {
                            System.out.print("  ");
                        }
                        break;
                    case 4:
                        if (baris == 1) {
                            System.out.print("T ");
                        } else if (baris == 8 || baris == 10) {
                            System.out.print("A ");
                        } else if (baris == 18) {
                            System.out.print("N ");
                        } else if (baris == 22 || baris == 26) {
                            System.out.print("I ");
                        } else if (baris == 29 || baris == 31) {
                            System.out.print("A ");
                        } else {
                            System.out.print("  ");
                        }
                        break;
                    case 5:
                        if (baris == 1) {
                            System.out.print("T ");
                        } else if (baris >= 9 && baris <= 12) {
                            System.out.print("A ");
                        } else if (baris >= 15 && baris <= 19) {
                            System.out.print("N ");
                        } else if (baris == 22 || baris == 26) {
                            System.out.print("I ");
                        } else if (baris >= 30 && baris <= 33) {
                            System.out.print("A ");
                        } else {
                            System.out.print("  ");
                        }
                        break;
                }
            }
            System.out.println();
        }
    }
}