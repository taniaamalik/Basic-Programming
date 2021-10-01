package bab3.TugasPraktikum;

import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        double volume, p, l, t, r;
        double phi = 3.14;
        for (int menu = 1; menu <= 2;) {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 0:
                        System.exit(0);
                    
                    break;
                case 1:
                        System.out.println("----------VOLUME BALOK----------");
                        System.out.print("Masukan p : ");
                        p = in.nextInt();
                        System.out.print("Masukan l : ");
                        l = in.nextInt();
                        System.out.print("Masukan t : ");
                        t = in.nextInt();
                        volume = p * l * t;
                        System.out.println("Volume Balok : " + volume);
                    
                    break;
                case 2:
                        System.out.println("----------VOLUME BOLA----------");
                        System.out.print("Masukan r : ");
                        r = in.nextInt();
                        volume = 4 / 3 * phi * r * r * r;
                        System.out.println("Volume Bola : " + volume);
                    
                    break;
                case 3:
                        System.out.println("----------VOLUME KERUCUT----------");
                        System.out.print("Masukan r : ");
                        r = in.nextInt();
                        System.out.print("Masukan t : ");
                        t = in.nextInt();
                        volume = 1 / 3 * phi * r * r * t;
                        System.out.println("Volume Kerucut : " + volume);
                    
                    break;
                case 4:
                        System.out.println("----------VOLUME SILINDER----------");
                        System.out.print("Masukan r : ");
                        r = in.nextInt();
                        System.out.print("Masukan t ; ");
                        t = in.nextInt();
                        volume = phi * r * r * t;
                        System.out.println("Volume Silinder : " + volume);
                    
                    break;
                case 5:
                        System.out.println("----------VOLUME LIMAS SEGITIGA----------");
                        System.out.print("Masukan p : ");
                        p = in.nextInt();
                        System.out.print("Masukan l : ");
                        l = in.nextInt();
                        System.out.print("Masukan t : ");
                        t = in.nextInt();
                        volume = 1 / 6 * p * l * t;
                        System.out.println("Volume Limas Segitiga : " + volume);
                    
                    break;
            }
        }
    }
}