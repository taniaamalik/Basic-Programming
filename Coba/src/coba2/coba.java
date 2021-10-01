package coba2;

import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Masukkan kata 1 : ");
        String kata = in.nextLine();
        System.out.print("Masukkan kata 2 : ");
        String kata2 = in.nextLine();
        int besar = kata.indexOf(kata2);
        System.out.println("posisi : " + (besar+1));
    }
}

    
    
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        System.out.print("Masukkan kata : ");
//        String kata = in.nextLine();
//        System.out.print("Dibalik : ");
//        for (int i = kata.length()-1; i >=0; i--) {
//            char bc = kata.charAt(i);
//        System.out.print(bc);
//        }
//        System.out.println();
//    }
//}

    
    
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        System.out.print("Masukkan kata : ");
//        String kata = in.nextLine();
//        System.out.print("Dibalik : ");
//        for (int i = kata.length()-1; i >=0; i--) {
//        String bc = kata.substring(i,i+1);
//            System.out.print(bc);
//        }
//        System.out.println();
//    }
//}
    
    
    
    
//        public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        System.out.print("Masukkan kata : ");
//        String kata = in.nextLine();
//        System.out.print("Dibalik : ");
//        for (int i = kata.length(); i >=1; i--) {
//        String bc = kata.substring(i-1,i);
//            System.out.print(bc);
//        }
//        System.out.println();
//    }
//}

    

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukan Kata : ");
//        String kata = in.nextLine();
//        System.out.print("Input : ");
//        String input = in.nextLine();
//        for (int i = 0; i < kata.length(); i++) {
//            String bc = kata.substring(i, i + 1);
//            if (input.equals(bc)) {
//                System.out.println("Posisi : " + (i + 1));
//            }
//        }
//    }
//}




//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukkan n : ");
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int k = n; k > i; k--) {
//                System.out.print("o");
//            }
//            System.out.println();
//        }
//    }
//}
    


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukan n : ");
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for(int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=n;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}