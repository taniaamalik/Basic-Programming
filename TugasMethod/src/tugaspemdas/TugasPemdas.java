package tugaspemdas; //nama packagenya tugaspemdass

import id.ac.ub.student.taniaamalik.library.PemdasLibrary; //Melakukan import library

public class TugasPemdas { //nama classnya TugasPemdass

    public static void main(String[] args) { //method main
        PemdasLibrary tania = new PemdasLibrary(); //memanggil import library yang dimasukkan ke variable tania
        System.out.println("Angka Dibalik = "); //mencetak kata "Angka Dibalik = "
        id.ac.ub.student.taniaamalik.library.PemdasLibrary.flip(); //memanggil method flip pada library id.ac.ub.student.taniaamalik.library
        System.out.println("==========================================="); //mencetak "==========================================="
        System.out.println("Menentukan Persamaan Nilai = "); //mencetak kata "Menentukan Persamaan Nilai = "
        id.ac.ub.student.taniaamalik.library.PemdasLibrary.persamaanNilai();
//memanggil method persamaanNilai pada library id.ac.ub.student.taniaamalik.library
        System.out.println("==========================================="); //mencetak "==========================================="
        System.out.println("Menentukan Nilai Terbesar Kedua = "); //mencetak kata Menentukan Nilai Terbesar Kedua = "
        id.ac.ub.student.taniaamalik.library.PemdasLibrary.max2(); //memanggil method max2 pada library id.ac.ub.student.taniaamalik.library
        System.out.println("==========================================="); //mencetak "==========================================="
        System.out.println("Menentukan Persamaan Kata = "); //mencetak kata "Menentukan Persamaan Kata = "
        id.ac.ub.student.taniaamalik.library.PemdasLibrary.palindrom(); //memanggil method palindrom pada library id.ac.ub.student.taniaamalik.library
    } //tanda akhir dari method main   
} //tanda akhir dari class TugasPemdass