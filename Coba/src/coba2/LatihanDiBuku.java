package coba2;

public class LatihanDiBuku {
      public static void main(String[] args) {
        double r, luas;
        System.out.println("Menghitung Luas Lingkaran");
        r = 20;
        luas = 3.14*r*r;
        System.out.println("Luas Lingkaran : " + luas);
    }
}
    
    /*public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan x : ");
        x = in.nextInt();
        System.out.print("Masukan y : ");
        y = in.nextInt();
        if ( x < y ) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}*/
    
    /*public static void main(String[] args) {
        int pembelian, discount, pembayaran;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Pembelian : ");
        pembelian = in.nextInt();
        if (pembelian>=100000){
            discount = pembelian/10;
            pembayaran = pembelian - discount;
            System.out.println(pembayaran);
        } else {
            discount = 0;
            pembayaran = pembelian - discount;
            System.out.println(pembayaran);
        }
    }
}*/
    
    /*public static void main(String[] args) {
        int pencacah = 1;
        while (pencacah < 5) {
            System.out.println("Selamat Belajar");
            pencacah++;
        }
    }
}*/
    
   /*public static void main(String[] args) {
        int angka = 1;
        int pangkat = 2;
        int hasil;
        while (angka <= 10) {
            hasil = (int) Math.pow(angka, pangkat);
            System.out.println(hasil);
            angka++;
        }
    }
}*/
    
    /*public static void main(String[] args) {
        int bil = 1 ;
        while (bil<11) {
            System.out.println("bil : " +bil);
            int perkalian = bil*bil;
            System.out.println("perkalian : " +perkalian);
            bil = bil+1 ;
        }
    }
}*/
    
    /*public static void main(String[] args) {
        int bil = 1 ;
        while ( bil < 10){
            if (bil != 5){
                System.out.println(bil);
            }
            bil = bil+1;
        }
    }
}*/
    
    /*public static void main(String[] args) {
        int n=5;
        while (n>0){
            System.out.println(n);
            n=n-1;
        }
    }
}*/
    
    /*public static void main(String[] args) {
        int bil = 0;
        int i = 1;
        while (i != 5) {
            int hasil = bil + 1;
            System.out.println(hasil);
            bil++;
            i++;
        }
    }
}*/
    
    /*public static void main(String[] args) {
        String pesan = "Selamat Belajar Java";
        System.out.println(pesan);
        System.out.println("Jumlah Karakter = " + pesan.length());
        }
    }*/
    
    /*public static void main(String[] args) {
        int tahun;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Tahun : ");
        tahun = in.nextInt();
        if (tahun%4!=0){
            System.out.println("Bukan Kabisat");
        } else if ((tahun%100==0) && (tahun%400!=0)){
            System.out.println("Bukan Kabisat");
        } else {
            System.out.println("Kabisat");
        }
    }
}*/