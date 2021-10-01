package coba2;
//
import java.util.Scanner;
//
public class BilPrima {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukan Angka : ");
//        int angka = in.nextInt();
//        if (angka % 2 == 0) {
//            System.out.println("genap");
//        } else {
//            System.out.println("ganjil");
//        }
//        if (angka > 1) {
//            if (angka == 2 || angka == 3) {   
//                System.out.println("prima");
//            } else if (angka % 2 != 0 && angka % 3 != 0) {
//                System.out.println("prima");
//            } else {
//                System.out.println("bukan prima");
//            }
//        } else {
//            System.out.println("bukan prima");
//
//        }
//        }
//    }
//}
  
    public static void main(String args[]) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("masukkan bilangan :");
        int bil = masukan.nextInt();
        int temp = 0;
        for (int i = 1; i < bil; i++) {
            if (bil % i == 0) {
                temp++;
            }
        }
        if (temp == 1) {
            System.out.println("bilangan prima");
        } else {
            System.out.println("Bukan Bilangan prima");
        }
    }
}