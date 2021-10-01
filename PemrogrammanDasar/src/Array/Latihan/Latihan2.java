package Array.Latihan;

public class Latihan2 {
    public static void main(String[] args) {

        int[] mhs = {87, 95, 79, 90, 86, 92, 72, 86, 65, 80};
        //int length = mhs.length;
        
//=================================================
        int terbesar = Integer.MIN_VALUE;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i] > terbesar) { 
                terbesar = mhs[i];
            }
        }
        System.out.println(terbesar);
        
//=================================================
        int terkecil = Integer.MAX_VALUE;
        for (int j = 0; j < mhs.length; j++) {
            if (mhs[j] < terkecil) {
                terkecil = mhs[j];
            }
        }
        
        System.out.println(terkecil);

//=================================================
        int search = 80;
        boolean a = false;
        for (int k = 0; k < mhs.length; k++){
            if (search == mhs[k]){
                a = true;
                break;
            }
        }
        System.out.println(a ? "ADA" : "TIDAK ADA");
    }
}