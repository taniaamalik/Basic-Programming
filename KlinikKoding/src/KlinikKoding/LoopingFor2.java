package KlinikKoding;

public class LoopingFor2{

    public static void main(String[] args) {
        for (int angka = 1; angka <= 100; angka++) {
            if (angka % 3 == 0) {
                System.out.println("Fizz");
            }
            if (angka % 5 == 0) {
                System.out.println("Buzz");
            }
            if (angka % 3 != 0 && angka % 5 != 0) {
                System.out.println(angka);
            }
            System.out.println();
        }
    }
}