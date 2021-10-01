package KlinikKoding;

import java.util.Scanner;

public class Method {

//    public static void main(String[] args) {
//        String[] mataKuliah = new String[5];
//        mataKuliah[0] = "Pemdas";
//        mataKuliah[1] = "Matkom";
//        mataKuliah[2] = "PIK";
//        mataKuliah[3] = "B.Indonesia";
//        mataKuliah[4] = "Agama";
//        for (int i = 0; i < mataKuliah.length; i++) {
//        System.out.println("Mata Kuliah Yang Saya Ambil : " + mataKuliah[i]);
//        }
//    }
//}
    
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Jumlah Mata Kuliah Yang Ingin Diambil : ");
//        int jmlh_matkul = in.nextInt();
//        String[] jumlah = new String[jmlh_matkul];
//        for(int i = 0 ; i<jmlh_matkul ; i++){
//            System.out.println("Mata Kuliah ke-" + (i+1) + "=");
//            String mataKuliah = in.next();
//            jumlah[i] = mataKuliah;
//        }
//        for(int i=0;i<jumlah.length;i++){
//            System.out.println(jumlah[i]);
//        }
//    }
//}
    
//method ada dua jenis void dan return value
    //void disebut prosedure  tidak mengembalikan angka
    //return itu function {perhitungan, ambil data dari database internet dll}
    
    public static void main(String[] args) {
        //avg(1, 2, 3);
        /*double rataRata = avg(1,2,3);
        System.out.println(rataRata);*/
        double kaliDua = avg(2,4,6) *2;
        System.out.println(kaliDua);
    }

    static double avg(int a, int b, int c) {
        int sum = a + b + c;
        return (double) sum / 3;
    }
}