package coba2;

import java.util.Arrays;
import java.util.Scanner;


public class PersamaanNilai {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan panjang array pertama : ");
        int panjang1 = in.nextInt();
        int[] array1 = new int[panjang1];
        
        System.out.print("Masukkan panjang array kedua : ");
        int panjang2 = in.nextInt();
        int[] array2 = new int[panjang2];
                
        for (int i = 0; i < panjang1; i++) {
            System.out.print("Masukkan nilai mahasiswa A ke-" + (i+1) + "=" + "\n") ;
            array1[i] = in.nextInt();
        }
        
        for (int i = 0; i < panjang2; i++) {
            System.out.print("Masukkan nilai mahasiswa B ke-" + (i+1) + "=" + "\n") ;
            array2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
       
        boolean x = true;
        for (int i = 0; i < array1.length; i++) {
            if(array1.length != array2.length){
                x=false;
            }
            else if (array1[i] != array2[i]) {
                x = false;
                break;
            }
        }
        
        System.out.println(x ? "Sama" : "Tidak Sama");
    }
}
   