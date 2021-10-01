package id.ac.ub.student.taniaamalik.numbertotextlibrary;

public class NumberToText {
    
//    public String read(int number){
//        String[] teks={"","satu","dua","tiga","empat","lima","enam",
//            "tujuh","delapan","sembilan","sepuluh","sebelas"};
//        
//        if (number<=11){
//        return teks[number];    
//        }else if(number<=19){
//            return teks[number%10] + " belas";
//        }else if(number<=99){
//            return teks[number/10] + " puluh " + teks[number%10];
//        }else{
//            return "seratus " + read(number%100);
//            //rekursif sebuah method yang memanggil dirinya sendiri
//            //teks[(number%100)/10] + " puluh " + teks[number%10];
//        }
//    }
//}
    
    
    public String read(long number){
        String[] teks={"","satu","dua","tiga","empat","lima","enam",
            "tujuh","delapan","sembilan","sepuluh","sebelas"};
        
        if (number<=11){
        return teks[(int)number];    
        }else if(number<=19){
            return read(number%10) + " belas";
        }else if(number<=99){
            return read(number/10) + " puluh " + read(number%10);
        }else if(number<=199){
            return "seratus " + read(number%100);
        }else if(number<=999) {
            return teks[(int)number/100] + " ratus " + read(number%100);
        }else if(number<=1999){
            return "seribu " + read(number%1000);
        }else if(number<=999_999){
            return read(number/1000) + " ribu " + read(number%1000);
        }else if(number<=999_999_999){
            return read(number/1_000_000) + " juta " + read(number%1_000_000);
        }else{
            return read(number/1_000_000_000) + " milyar " + read(number%1_000_000_000);
       }
    }
}