package KlinikKoding;

public class LatihanUts1 {

    public static void main(String[] args) {
        //%s = String
        //%d = bilangan bulat
        //%f = float
        //%c = character
        /*System.out.printf("%s\n", "FILKOM");
        System.out.printf("%s %d\n", "Fakultas Ilmu Komputer", 100);
        System.out.printf("%s %s %s %d\n", "Fakultas", "Ilmu", "Komputer", 100);
        System.out.printf("%20s %5s %s %d\n", "Fakultas", "Ilmu", "Komputer", 100);
        System.out.printf("%-20s %5s %s %10d\n", "Fakultas", "Ilmu", "Komputer", 100);
        System.out.printf("%-10s %-10s %-10s %-10d\n", "Fakultas", "Ilmu", "Komputer", 100);
        System.out.printf("%-10s / %-10s / %-10s / %-10d\n", "Fakultas", "Ilmu", "Komputer", 100);
        System.out.printf("%f\n", 2.4);
        System.out.printf("%.1f\n", 2.4);
        System.out.printf("%.2f\n", Math.PI);*/

        //operator perbandingan
        // ==,<,>,<=,>=,!=
        //operand yang dibandingkan
        //Operator logical &&,&,||,|
        /*boolean coba = 1+2 ==3;
        System.out.println(coba);*/
 /*boolean coba = 25<5*5;
        System.out.println(coba);*/
 /*boolean coba = 8+1>=3*3;
        System.out.println(coba);*/
 /*boolean coba = 10.00 + 0.10 < 11.00;
        System.out.println(coba);*/
 /*boolean coba = 10.00 + 0.10< 10.00;
        System.out.println(coba);*/
        //gaada kurung kurawal yang dieksekusi bawahnya
        /*int height = 10;
        if (height <= 12)
            System.out.print("Low bridge : ");
        System.out.println("Proceed with caution.");*/
        //duaduanya tercetak
        /*int height = 10;
        if (height <= 12){
            System.out.print("Low bridge : ");
        System.out.println("Proceed with caution.");
        }*/
 /*int height = 30;
        if (height <= 12){
            System.out.print("Low bridge : ");
        System.out.println("Proceed with caution.");
        }*/
 /*int depth = 8;
        if (depth >= 8) {                    //blog
            System.out.print("Danger : ");   //blog
            System.out.print("deep water."); //blog
        }
        System.out.println("No swimming allowed.");
    }
}*/
 /*int h=3;
        System.out.println(++h *2);
        System.out.println(h);
    }
}*/
 /*int h=3; // h =3
        int a = ++h *2; //a=8 h=4
        int s =h >3 ? h++ *2 +a : --h *a--; 
        System.out.println(s);
        System.out.println(h);
    }
}*/
        //h-- = nilai h selanjutnya berubah
        //--h = nilai h dikurang
        int h = 3; // h =3
        int a = ++h * 2; //a=8 h=4
        int s = h >= 3 ? -1 * (h-- * h + 90) : h-- * --a; //h--=4, --h=3
        System.out.println(s + 21);
    }
}

//gabisa dirubah
/*final int a=1;
        a=5;
    }
}*/

 /*Math.PI = 4;
        a=5;
}
}*/
        
        //string bukan tipe data primitif