package Method;

import java.util.Scanner;

public class Prak_retval {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, tmpt_lahir1, nim2, nama2, jur1, jur2, tmpt_lahir2;
        int thn_lahir1, umur1, thn_lahir2, umur2;
        System.out.println("Masukan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.println("Masukkan Tempat Lahir Mahasiswa 1 : ");
        tmpt_lahir1 = in.nextLine();
        System.out.println("Masukkan Tahun Lahir Mahasiswa 1 : ");
        thn_lahir1 = in.nextInt();
        umur1 = 2017 - thn_lahir1;
        in.nextLine();
        System.out.println("Masukan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        System.out.println("Masukkan Tempat Lahir Mahasiswa 2 : ");
        tmpt_lahir2 = in.nextLine();
        System.out.println("Masukkan Tahun Lahir Mahasiswa 2 : ");
        thn_lahir2 = in.nextInt();
        umur2 = 2017 - thn_lahir2;
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1, umur1));
        System.out.println(showData(nim2, nama2, jur2, umur2));
    }
    public static String showData(String nim, String nama, String jurusan, int umur) {
        String ket;
        if(umur > 20)
            ket="Adult";            
        else
            ket="teen";
        String show = "\nnim : \n" + nim + "\nnama : \n" + nama + "\nJurusan : \n" + jurusan + "\nStatus: \n" + ket;
        return show;
    }
}
