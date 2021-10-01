package tugas3;

public class Tugas1 {
    public static void main(String[] args) {
        int[] mhs1 = {65,85,95,75};
        int[] mhs2 = {65,85,75,95};
        boolean x = true;
        for(int i = 0; i < mhs1.length ; i++){
            if (mhs1[i]!=mhs2[i]){
                x = false;
                break;       
            }
        }
        System.out.println( x ? "Sama" : "Tidak Sama");
    }
}
