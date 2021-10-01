package id.ac.ub.student.taniaamalik.library; //nama packagenya id.ac.ub.student.taniaamalik.library

import java.util.Scanner; //Melakukan import dari package Scanner 
import java.util.Arrays; //Mealkukan import dari package array

public class PemdasLibrary { //nama classnya PemdasLibrary

    public static void flip() { //nama methodnya flip
        Scanner in = new Scanner(System.in); //Deklarasi Scanner dengan nama variable in 
        System.out.print("Masukan Jumlah Array : "); //Mencetak kalimat "Masukan Jumlah Array" 
        int jmlh_array = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama jmlh_array yang bertipe data integer 
        int[] nilai = new int[jmlh_array]; //mendeklarasikan variable jmlh_array kedalam array of integer pada variable nilai
        for (int i = 0; i < jmlh_array; i++) { 
//untuk variable i yang bertipe data integer nilai awalnya 0 dimana nilai batas i kurang dari variable jmlh_array kemudian variable i diincrementkan 
            System.out.print("Masukan Angka ke-" + (i + 1) + "="); 
//Mencetak kalimat "Masukan angka ke-" dan proses perhitungan variable i+! lalu mencetak "=" 
            int angka = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama angka yang bertipe data integer 
            nilai[i] = angka; //memasukkan variable angka kedalam array nilai indeks i 
        } //tanda akhir dari for
        System.out.println("Dibalik menjadi : "); //Mencetak kalimat "Dibalik Menjadi : " 
        for (int dibalik = (jmlh_array - 1); dibalik >= 0; dibalik--) {  
/*untuk variable dibalik yang bertipe data integer nilai awalnya variable jmlh_array dikurang 1 
dimana nilai batas dibalik lebih dari atau sama dengan 0 kemudian variable dibalik didecrementkan */
            System.out.println(nilai[dibalik]); //Mencetak hasil dari array nilai dibalik
        } //tanda akhir dari for
    } //tanda akhir dari method flip

    public static void persamaanNilai() { //nama methodnya persamaanNilai
        Scanner in = new Scanner (System.in); //Deklarasi Scanner dengan nama variable in 
        System.out.print("Masukkan panjang array pertama : "); //Mencetak kalimat "Masukkan panjang array pertama : "
        int panjang1 = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama panjang1 yang bertipe data integer 
        int[] array1 = new int[panjang1]; //mendeklarasikan variable panjang1 kedalam array of integer pada variable array1
        System.out.print("Masukkan panjang array kedua : "); //Mencetak kalimat "Masukkan panjang array kedua : "
        int panjang2 = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama panjang2 yang bertipe data integer 
        int[] array2 = new int[panjang2]; //mendeklarasikan variable panjang2 kedalam array of integer pada variable array2
        for (int i = 0; i < panjang1; i++) {
//untuk variable i yang bertipe data integer nilai awalnya 0 dimana nilai batas i kurang dari variable panjang1 kemudian variable i diincrementkan 
            System.out.println("Masukkan nilai mahasiswa A ke-" + (i+1) + "=") ; 
//Mencetak kalimat "Masukan angka ke-" dan proses perhitungan variable i+! lalu mencetak "="
            int nilai1 = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama nilai1 yang bertipe data integer 
            array1[i] = nilai1; //memasukkan variable nilai1 kedalam array1 nilai indeks i 
        } //tanda akhir dari for
        for (int i = 0; i < panjang2; i++) {
//untuk variable i yang bertipe data integer nilai awalnya 0 dimana nilai batas i kurang dari variable panjang2 kemudian variable i diincrementkan
            System.out.println("Masukkan nilai mahasiswa B ke-" + (i+1) + "=") ; 
//Mencetak kalimat "Masukan angka ke-" dan proses perhitungan variable i+! lalu mencetak "="
            int nilai2 = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama nilai2 yang bertipe data integer
            array2[i] = nilai2; //memasukkan variable nilai2 kedalam array2 nilai indeks i 
        } //tanda akhir dari for
        System.out.println(Arrays.toString(array1)); //Perintah untuk mencetak data yang dimasukkan ke variable array1
        System.out.println(Arrays.toString(array2)); //Perintah untuk mencetak data yang dimasukkan ke variable array2
        boolean x = true; //variable x dengan tipe data boolean bernilai true
        for (int i = 0; i < array1.length; i++) {
//untuk variable i yang bertipe data integer nilai awalnya 0 dimana nilai batas i kurang dari panjang variable array1 kemudian variable i diincrementkan
            if(array1.length != array2.length){ //jika panjang array1 tidak sama dengan panjang array2 
                x=false; //variable x bernilai false 
            } //tanda akhir dari if
            else if (array1[i] != array2[i]) { //jika indeks i array1 tidak sama dengan indeks i array2
                x = false; //variable x bernilai false 
                break; //akan keluar dari loop 
            } //tanda akhir dari else if
        } //tanda akhir dari for 
        System.out.println(x ? "Sama" : "Tidak Sama"); //jika x berniai true akan mencetak kata "Sama", jika x bernilai false akan mencetak "Tidak Sama" 
    } //tanda akhir dari method persamaanNilai

    public static void max2() { //nama methodnya max2
        Scanner in = new Scanner(System.in); //Deklarasi Scanner dengan nama variable in 
        System.out.print("Masukan Jumlah Array : "); //mencetak kalimat "Masukkan Jumlah Array" 
        int jmlh_array = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama jmlh_array yang bertipe data integer 
        int[] nilai = new int[jmlh_array]; //mendeklarasikan variable jmlh_array kedalam array of integer pada variable nilai
        for (int i = 0; i < jmlh_array; i++) { 
//untuk variable i yang bertipe data integer nilai awalnya 0 dimana nilai batas i kurang dari jmlh_array kemudian variable i diincrementkan 
            System.out.print("Masukan Angka ke-" + (i + 1) + "="); 
//Mencetak kalimat "Masukan angka ke-" dan proses perhitungan variable i+! lalu mencetak "=" 
            int angka = in.nextInt(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama angka yang bertipe data integer 
            nilai[i] = angka; //memasukkan variable angka kedalam array nilai indeks i 
        }  //tanda akhir dari for 
        System.out.println(); //mencetak enter
        int terbesar = Integer.MIN_VALUE; 
//untuk menampilkan nilai terkecil dari integer yang akan disimpan ke dalam variable terbesar dengan tipe data integer
        int terbesar2 = Integer.MIN_VALUE; 
//untuk menampilkan nilai terkecil dari integer yang akan disimpan ke dalam variable terbesar2 dengan tipe data integer 
        for (int i = 0; i < jmlh_array; i++) { 
//untuk variable i yang bertipe data integer nilai awalnya 0 dimana nilai batas i kurang dari variable jmlh_array kemudian variable i diincrementkan 
            if (nilai[i] > terbesar) { //jika array nilai indeks i lebih besar dari terbesar
                terbesar2 = terbesar; // variable terbesar dimasukkan kedalam variable terbesar2
                terbesar = nilai[i];  //array nilai indeks i dimasukan kedalam variable terbesar 
            } //tanda akhir dari if
        } //tanda akhir dari for
        for (int i = 0; i < jmlh_array; i++) {  
//untuk variable i yang bertipe data integer nilai awalnya 0 dimana nilai batas i kurang dari variable jmlh_array kemudian variable i diincrementkan 
            if (nilai[i] != terbesar && nilai[i] > terbesar2) { 
//jika array nilai indeks i tidak samadengan terbesar dan array nilai indeks i lebih besar dari terbesar2
                terbesar2 = nilai[i]; //array nilai indeks i dimasukan kedalam variable terbesar2
            } //tanda akhir dari if
        } //tanda akhir dari for
        System.out.println("====================="); //mencetak "=====================" 
        System.out.println("Angka terbesar ke-2 : " + terbesar2); 
//mencetak kalimat "Angka terbesar ke-2 : " dan menampilkan hasil dari varible terbesar2    
    } //tanda akhir dari method max2

    public static void palindrom() { //nama methodnya palindrom
        Scanner in = new Scanner(System.in); //Deklarasi Scanner dengan nama variable in
        String subk2 = ""; //menginisialisasi variable subk2 yang tipe data String dengan nilai kosong 
        System.out.print("Masukan kata : "); //mencetak kalimat "Masukan kata : " 
        String kata = in.nextLine(); //Perintah untuk memasukkan inputan dengan Scanner pada variable dengan nama kata yang bertipe data String 
        char[] subk = kata.toCharArray(); //untuk memecah String menjadi array of char pada variable subk 
        for (int i = kata.length() - 1; i >= 0; i--) { 
/*untuk variable i yang bertipe data integer nilai awalnya yaitu panjang dari variable kata dikurang satu 
dimana nilai batas i lebih dari atau sama dengan 0 kemudian variable i didecrementkan*/
            subk2 = subk2 + subk[i]; //variable subk2 + variable subk indeks i yang disimpan dalam variable subk2 
        } //tanda akhir dari for
        if (subk2.equals(kata)) { //jika variable subk2 sama dengan variable kata
            System.out.println(true); //maka akan mencetak true
        } else { //selain itu 
            System.out.println(false); //maka akan mencetak false
        } //tanda akhir dari else
    } //tanda akhir dari method palindrom
} //tanda akhir dari class PemdasLibrary