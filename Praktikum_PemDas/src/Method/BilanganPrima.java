package Method;
import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan bilangan prima : ");
        int prima = in.nextInt();
        MenentukanPrima(prima);
        BilPrima();
    }
    public static void MenentukanPrima(int prima) {
        int temp = 0;
        for (int i = 1; i < prima; i++) {
            if (prima % i == 0) {
                temp++;
            }
        }
        if (temp == 1) {
            System.out.println("bilangan " + prima + " termasuk bilangan prima");
        } else {
            System.out.println("bilangan " + prima + " termasuk bukan bilangan prima");
        }
    }
    public static void BilPrima() {
        System.out.println("program menentukan bilangan prima 1-100");
        for (int i = 0; i <= 100; i++) {
            int x = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i != j) {
                        x = 1;
                    }
                    if (x != 1 && i == j) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
        System.out.println();
    }
}