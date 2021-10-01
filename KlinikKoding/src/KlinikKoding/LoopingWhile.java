package KlinikKoding;

public class LoopingWhile {

    public static void main(String[] args) {
        int angka = 1;

        while (angka <= 100) {
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
            angka++;
        }
    }
}