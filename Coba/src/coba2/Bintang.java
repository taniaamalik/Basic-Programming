package coba2;

import java.util.Scanner;

public class Bintang {

    /*public static void main(String[] args) {
        for (int i =1 ; i<=5;i++){
            System.out.print("*");
    }
        System.out.println();
    }
    
}*/
    
        /*public static void main(String[] args) {
        for (int i =1 ; i<=5;i++){
            for(int j=1;j<=5;j++){
            System.out.print("*");
            }
             System.out.println();
    }
        System.out.println();
    }
    
}*/
    
        /*public static void main(String[] args) {
        for (int i =1 ; i<=4;i++){ //i =2,j=2,keluar
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
             System.out.println();
    }
        System.out.println();
    }
    
}*/
    /*s=4 *=1
      s=3 *=2
      s=2 *=3
      s=3 *=4
      s+4 *=5 */
    
    
        /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/* i=1   i=1
   j=4   j=3
!!
*/
    

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}*/

/* i=1 i=1
   j=1 j=2
1<=3 2<=3
11
*/
    
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(j<=n-i? " " : "*");
                }
            }
                System.out.println();
        }
    }
    
   /*public static void main(String[] args) {
        outer:
        for (int i = 1,n=5; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("Z");
                } else if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.println("Z");
                    continue outer;
                }
            }
        System.out.println();
        }
    }
}*/