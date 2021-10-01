package TugasAkhir;

import java.util.Scanner;

public class TugasAkhir {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        for (int menu = 1; menu <= 2;) {
        System.out.println("------------------------------------------");
        System.out.println("1. Menghitung Konversi suhu");
        System.out.println("2. Menghitung Luas Bidang Datar");
        System.out.println("3. Menghitung Volume Bangun");
        System.out.println("4. Mengkonversi bilangan");
        System.out.println("5. Exit");
        System.out.print("Pilihan anda : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                konversiSuhu();
                break;
            case 2:
                luasBidangDatar();
                break;
            case 3:
                volumeBangunRuang();
                break;
            case 4:
                konversiBilangan();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                break;
            }
        }
        System.out.println("------------------------------------------");
    }

    public static void konversiSuhu() {
        Scanner in = new Scanner(System.in);
        int pilihan;
        double celcius, fahrenheit, kelvin, reamur;
        System.out.println("------------------------------------------");
        System.out.println("1. Celcius -> Fahrenheit");
        System.out.println("2. Celcius -> Kelvin");
        System.out.println("3. Celcius -> Reamur");
        System.out.print("Masukkan Suhu Dalam Celcius : ");
        celcius = in.nextDouble();
        System.out.print("Pilihan anda : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                fahrenheit = (celcius * 9 / 5) + 32;
                System.out.println(celcius + " Celcius : " + fahrenheit + " Fahrenheit");
                break;
            case 2:
                kelvin = celcius + 273.15;
                System.out.println(celcius + " Celcius : " + kelvin + " Kelvin");
                break;
            case 3:
                reamur = celcius * 4 / 5;
                System.out.println(celcius + " Celcius : " + reamur + " Reamur");
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                break;
        }
    }

    public static void luasBidangDatar() {
        Scanner in = new Scanner(System.in);
        int pilihan;
        double luas, s, a, t, r, sa, sb, p, l;
        double phi = 3.14;
        System.out.println("------------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Persegi Panjang");
        System.out.print("Pilihan anda : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi : ");
                s = in.nextDouble();
                luas = s * s;
                System.out.println("Luas Pesegi : " + luas + " cm²");
                break;
            case 2:
                System.out.print("Masukkan alas : ");
                a = in.nextDouble();
                System.out.print("Masukkan tinggi : ");
                t = in.nextDouble();
                luas = a * t / 2;
                System.out.println("Luas Segitiga : " + luas + " cm²");
                break;
            case 3:
                System.out.print("Masukkan jari-jari : ");
                r = in.nextDouble();
                luas = phi * r * r;
                System.out.println("Luas Lingkaran : " + luas + " cm²");
                break;
            case 4:
                System.out.print("Masukkan alas : ");
                a = in.nextDouble();
                System.out.print("Masukkan tinggi : ");
                t = in.nextDouble();
                luas = a * t;
                System.out.println("Luas Jajar Genjang : " + luas + " cm²");
                break;
            case 5:
                System.out.print("Masukkan sisi atas : ");
                sa = in.nextDouble();
                System.out.print("Masukkan sisi bawah : ");
                sb = in.nextDouble();
                System.out.print("Masukkan tinggi :");
                t = in.nextDouble();
                luas = (sa + sb) * t / 2;
                System.out.println("Luas Trapesium : " + luas + " cm²");
                break;
            case 6:
                System.out.print("Masukan panjang : ");
                p = in.nextDouble();
                System.out.print("Masukan lebar : ");
                l = in.nextDouble();
                luas = p * l;
                System.out.println("Luas persegi panjang : " + luas + " cm²");
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                break;
        }
    }
    
    public static void volumeBangunRuang() {
        Scanner in = new Scanner(System.in);
        int pilihan;
        double volume, s, a, t, r, p, l, ts, tp;
        double phi = 3.14;
        System.out.println("------------------------------------------");
        System.out.println("1. Kubus");
        System.out.println("2. Kerucut");
        System.out.println("3. Cylinder");
        System.out.println("4. Bola");
        System.out.println("5. Balok");
        System.out.println("6. Prisma");
        System.out.print("Pilihan anda : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi : ");
                s = in.nextDouble();
                volume = s * s * s;
                System.out.println("Volume Kubus : " + volume + " cm3");
                break;
            case 2:
                System.out.print("Masukkan jari-jari : ");
                r = in.nextDouble();
                System.out.print("Masukkan tinggi : ");
                t = in.nextDouble();
                volume = phi * r * r * t / 3;
                System.out.println("Volume Kerucut : " + volume + " cm3");
                break;
            case 3:
                System.out.print("Masukkan jari-jari : ");
                r = in.nextDouble();
                System.out.print("Masukkan tinggi : ");
                t = in.nextDouble();
                volume = phi * r * r * t;
                System.out.println("Volume Cylinder : " + volume + " cm3");
                break;
            case 4:
                System.out.print("Masukkan jari-jari : ");
                r = in.nextDouble();
                volume = phi * r * r * r * 4 / 3;
                System.out.println("Volume Bola : " + volume + " cm3");
                break;
            case 5:
                System.out.print("Masukkan panjang : ");
                p = in.nextFloat();
                System.out.print("Masukkan lebar : ");
                l = in.nextFloat();
                System.out.print("Masukkan tinggi : ");
                t = in.nextFloat();
                volume = p * l * t;
                System.out.println("Volume Balok : " + volume + " cm3");
                break;
            case 6:
                System.out.print("Masukkan alas segitiga : ");
                a = in.nextDouble();
                System.out.print("Masukkan tinggi segitiga : ");
                ts = in.nextDouble();
                System.out.print("Masukkan tinggi prisma : ");
                tp = in.nextDouble();
                volume = tp * a * ts / 2;
                System.out.println("Volume Prisma : " + volume + " cm3");
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                break;
        }
    }
    
    public static void konversiBilangan() {
        Scanner in = new Scanner(System.in);
        int pilihan;
        System.out.println("------------------------------------------");
        System.out.println("1. Dari bilangan ke Romawi");
        System.out.println("2. Dari Romawi ke Bilangan");
        System.out.println("3. Dari Bilangan Ke Kalimat");
        System.out.println("4. Dari Bilangan Ke Biner");
        System.out.print("Pilihan anda : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan : ");
                int bil = in.nextInt();
                System.out.println(bilToRom(bil));
                break;
            case 2:
                System.out.print("Masukkan romawi : ");
                String r = in.next();
                System.out.println(romToBil(r));
                break;
            case 3:
                System.out.print("Masukkan bilangan : ");
                int bil2 = in.nextInt();
                System.out.println(bilToKal(bil2));
                break;
            case 4:
                System.out.print("Masukkan Bilangan : ");
                int bil3 = in.nextInt();
                bilToBinn(bil3);
                System.out.println();
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                break;
        }
    }
    
    public static String bilToRom(int bilangan) {

        String[] teks={"","I","II","III","IV","V","VI",
            "VII","VIII","IX","X"};
        
        if (bilangan<=10){
        return teks[bilangan];    
        }else if(bilangan<=39){
            return "X" + bilToRom(bilangan-10);
        }else if(bilangan<=49){
            return "XL" + bilToRom(bilangan-40);
        }else if(bilangan<=89){
            return "L" + bilToRom(bilangan-50);
        }else if(bilangan<=99){
            return "XC" + bilToRom(bilangan-90);
        }else if(bilangan<=399){
            return "C" + bilToRom(bilangan-100);
        }else if(bilangan<=499){
            return "CD" + bilToRom(bilangan-400);
        }else if(bilangan<=899){
            return "D" + bilToRom(bilangan-500);  
        }else if(bilangan<=999){
            return "CM" + bilToRom(bilangan-900);
        }else{
            return "M" + bilToRom(bilangan-1000);
        }
    }
    
    public static int romToBil(String romawi) {
        int bil = 0;
        for (int i = 0; i < romawi.length(); i++) {
            char rom = romawi.charAt(i);
            if (rom == 'I') {
                bil += 1;
            }
            if (rom == 'V') {
                bil += 5;
            }
            if (rom == 'X') {
                bil += 10;
            }
            if (rom == 'L') {
                bil += 50;
            }
            if (rom == 'C') {
                bil += 100;
            }
            if (rom == 'D') {
                bil += 500;
            }
            if (rom == 'M') {
                bil += 1000;
            }
        }
        if (romawi.contains("IV")) {
            bil -= 2;
        }
        if (romawi.contains("IX")) {
            bil -= 2;
        }
        if (romawi.contains("XL")) {
            bil -= 20;
        }
        if (romawi.contains("XC")) {
            bil -= 20;
        }
        if (romawi.contains("CD")) {
            bil -= 200;
        }
        if (romawi.contains("CM")) {
            bil -= 200;
        }
        return bil;
    }
    
    public static String bilToKal(int bilangan) {

        String[] teks={"","satu","dua","tiga","empat","lima","enam",
            "tujuh","delapan","sembilan","sepuluh","sebelas"};
        
        if (bilangan<=11){
        return teks[(int)bilangan];    
        }else if(bilangan<=19){
            return bilToKal(bilangan%10) + " belas";
        }else if(bilangan<=99){
            return bilToKal(bilangan/10) + " puluh " + bilToKal(bilangan%10);
        }else if(bilangan<=199){
            return "seratus " + bilToKal(bilangan%100);
        }else if(bilangan<=999) {
            return teks[bilangan/100] + " ratus " + bilToKal(bilangan%100);
        }else if(bilangan<=1999){
            return "seribu " + bilToKal(bilangan%1000);
        }else if(bilangan<=999_999){
            return bilToKal(bilangan/1000) + " ribu " + bilToKal(bilangan%1000);
        }else{
            return bilToKal(bilangan/1_000_000) + " juta " + bilToKal(bilangan%1_000_000);
        }
    }
    
    public static void bilToBinn(int n) {
        if(n>1){
            bilToBinn(n/2);
        }
        System.out.print(n%2);
    }
}