package Method2;

public class Rekursif {

    public static void main(String[] args) {
        int hasil;
        int bilangan =5;
        hasil = faktorial(bilangan);
        System.out.println("Nilai dari " + bilangan + "! adalah " + hasil);
    }

    private static int faktorial(int bil) {
        if (bil == 1)
            return 1;
            else         
            return (bil * faktorial(bil-1));
        }
    }
