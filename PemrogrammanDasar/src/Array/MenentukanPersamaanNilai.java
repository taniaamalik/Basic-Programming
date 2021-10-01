package Array;

public class MenentukanPersamaanNilai {
    public static void main(String[] args) {
        int[] mhs1 = {65, 85, 95, 75};
        int[] mhs2 = {65, 85, 95, 75};
        boolean x = true;
        for (int i = 0; i < mhs1.length; i++) {
            if (mhs1.length != mhs2.length){
                x=false;}
            else if (mhs1[i] != mhs2[i]) {
                x = false;
                break;
            }
        }
        System.out.println(x ? "Sama" : "Tidak Sama");
    }
}