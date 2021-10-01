package Array.Latihan;

import java.util.Arrays;

public class Latihan3 {
//    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//        if(args.length > 0){
//            System.out.println("Hello, " +args[0]);
//        }
//    }
//}
    
    
    
//mojokerto, malang,surabaya
    //array 2 dimensi, array satu dimensi yang didalemn elemennya satu dimensi

    
//    public static void main(String[] args) {
//        //array 1 dimensi
//        double[] a = {
//            10,
//            20,
//            30
//        };
////array 2 dimensi
//         double[][] jarak2d = {
//             {0,90,60.5}, //baris 
//             {90,0,50}, //baris
//             {60,50.5,0} //baris
//         };
//            System.out.println(jarak2d.length);
//            System.out.println(jarak2d[1][2]); //baris satu kolom 2
//            System.out.println(Arrays.toString(jarak2d[0]));
//            System.out.println(Arrays.toString(jarak2d)); //ngeprint alamat array tigatiganya
//            System.out.println(jarak2d[0]); //ngeprint alamat
//    }
//}

    
//        //array 3d
//    double[][][] jarak3d={
//        {[], [], []},
//        {[], [], []},
//        {[], [], []}
//    };
//    }
//}


//    public static void main(String[] args) {
//        double [][] jarak2d = {
//            {10,20,30},
//            {10,20},
//            {10}
//        };
//        System.out.println(jarak2d.length);
//        System.out.println(jarak2d[0].length);
//        System.out.println(jarak2d[1].length);
//        System.out.println(jarak2d[2].length);
//    }
//}
    
    


//    public static void main(String[] args) {
//        int[] a = new int[5];
//   
//        //Ragged Array
//        //Asymmetric Array
//        int[][] jarak2d = {
//            {10,20,30},
//            {10,20},
//            {10}
//        };
//        
//        int[][] jarak2d2 = new int [3][];
//        jarak2d2[0] = new int [3]; //baris 0 //panjang 3
//        jarak2d2[1] = new int [2];
//        jarak2d2[2] = new int [1];
//        
//        System.out.println(jarak2d.length);
//        System.out.println(jarak2d[0].length);
//        System.out.println(jarak2d[1].length);
//        System.out.println(jarak2d[2].length);
//    }
//}
    



    public static void main(String[] args) {
        //Ragged Array
        //Asymmetric Array
        int[][] jarak2d = {
            {10,20,30},
            {10,20},
            {10,20,30,40}
        };
        for (int i = 0; i < jarak2d.length; i++) { //melooping jumlah baris
            for(int j=0;j<jarak2d[i].length;j++){
                System.out.print(jarak2d[i][j] + " ");
            
        }
            System.out.println();
        }
    }
}