package Array.Latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

//        sifat : imperative // memerintah atau mengontrol
/*        for (int i = 0; i < a.length; i++) { //sebagai penanda/urutan/indeks untuk mengambil array di a, urutan atau indeks ke i //mengganti urutan (int i=a.length-1; i>=0;i--)
            System.out.println(a[i]);
        }
    }
} */
//untuk menggantikan for
//FOR EACH
//menghapus varable i, karena variable i cuma berfungsi untuk digunakan menunjukan elemen i di array a
// Sifat : declarative //mendeklarasi saja diserahkan ke jvm
         for (int i : a) { //int number //setiap elemen a dimasukan ke i satupersatu //gangurusin urutan //akses setiap elemen dari array a
            System.out.println(i); //( number)
        }
    }
} 
        //pake java.util
        /*System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) { //elemen di array a diincrement niainya jadi 2,3,4,5
            a[i]++;
        }
        System.out.println(Arrays.toString(a));
        //looping mau pake for each

        for (int x : a) { //ga mengakses langsung ke array aslinya etapi setiap elemen di array a dicopykan ke x, karena dicopykan x nya diincrement a nya ga ngeffect nilainya tetap 2,3,4,5
            x++;
        }
        //looping for each equivalen dengan ;
        for (int i = 0; i < a.length; i++) {
            int j = a[i];
            j++;
        }
        System.out.println(Arrays.toString(a));
    }
} */
        
        //variable primitive dan reference
        // array of integers variable reference tetapi setipa didalam array primitive
        
        //jika array di sout nanti dia keluarnya adress di java bukan yang kita inginkan
        
//contoh :
    //int[] b = {1,2,3,4}; //walaupun a dan b sama tapi addres dijava berbeda
      // int[] b =a; //biar sama
       // System.out.println(a);
        //System.out.println(b);
  //  }
//}
// a berubah, b juga harus berubah sifat tetap
/**int[] b=a;
    for (int i=0;i<a.length;i++){
    a[i]++;
    }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}*/



//BARU LAGI

        //Scanner in = new Scanner(System.in);
        //int index = in.nextInt();
        
          /* if(index==1){
               System.out.println("Senin");
           }else if(index==2){
               System.out.println("Selasa");
           }
           }
}*/
          
//bisa dipersingkat pakai array:
//            Scanner in = new Scanner(System.in);
//            String[] dayNames = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
//            int index = in.nextInt();
//            
//            System.out.println(dayNames[index-1]);
//    }
//}
            



        /*int[] x = {1, 2, 3, 4};
        int[] y = new int[x.length];
        
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}*/
        
       
        
//soal 1
       /* int[] a = {1, 2, 3, 4};
        int[] b = new int[a.length];
        // b = [4, 1, 2, 3]

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                b[i] = a[a.length - 1];
            } else {
                b[i] = a[i - 1];
            }

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
} */

//soal 1.1

       /*int[] a = {1, 2, 3, 4};
        int[] b = new int[a.length];
        // b = [4, 1, 2, 3]

        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1){
                b[0] = a[i];
                continue; //bisa break;
            }
            b[i+1] = a[i];
            }
                   System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
} */
       
        
//soal 1.2

       /* int[] a = {1, 2, 3, 4};
        int[] b = new int[a.length];
        // b = [4, 1, 2, 3]

        for (int i = 0; i < a.length; i++) {
            b[(i+1)% a.length] = a[i];
            }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
} */
  
       
       //nyoba
//        int[] a = {2,3,4,5};
//        int[] b = new int[a.length];
//        b ={5,2,3,4}
//        
//        for (int i=0 ; i<a.length;i++){
//            b[(i+1)%a.length] = a[i];
//            if(i==0){
//                b[i] = a[a.length-1];
//            }else{
//                b[i]=a[i-1];
//            }
//        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//    }
//}