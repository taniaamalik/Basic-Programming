package bab4;

public class Array1 {

    public static void main(String args[]) {
        int bil[] = new int[10];
        int i;
        for (i = 0; i <= 9; i++) {
            bil[i] = 1 + (int) (Math.random() * 100); //math random buat angka acak, membuat skala 1-100,(int) casting dari mathrandom yang bertipe asli//int dihapus double ke int gabisa jadi harus dicasting.
        }
        for (i = 0; i < 10; i++) {
            System.out.println(bil[i]);
        }
    }
}

//2. karna kalau dalam array harus diinisialisasi panjang arraynya
//3. 