package bab4;

import java.util.Scanner;

public class Array2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double nilaiRata2=0;
        double sum=0;
        String nama[] = new String[10];
        int[][] coba = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        double[][] bank = new double[2][3];
        System.out.println(" i j coba[i][j]");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d %2d %3d\n", i, j, coba[i][j]); //%f double
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(bank[i][j] + " ");
            }
        }
        for(int i=0;i<coba.length;i++){
            for(int j=0;j<3;j++){
                sum=sum+coba[i][j];
            }
            nilaiRata2=sum/12;
        }
            System.out.println();
            System.out.println("hasil : " + nilaiRata2);

        double nilaiMax = bank[0][0];
        double nilaiMin=bank[0][0];
          for (int i = 0; i < bank.length; i++) {
              for (int j = 0; j < bank[i].length; j++) {
                  if(bank[i][j]<nilaiMin){
                      nilaiMin=bank[i][j];
                  }else{
                      nilaiMax=bank[i][j];
                  }
              }
        }
          System.out.println("Max: " +nilaiMax);
          System.out.println("Min: " +nilaiMin);
    }

}