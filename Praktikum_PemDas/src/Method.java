public class Method {
    
   public static void A (String parameter){
       System.out.println("hello weebs");
   } 
//   public static void main(String[] args) {
//   A(3);
//}
//}
   
   //method return value, memiliki tipe  mengembalikan nilai
   //void langsung ngecetak
   //nilai static berubah-ubah
   //method boleh sama parameter beda
   

public  static int B(){
    int a = 2 ;
    int b = 3;
    int c = a+b;
    return c;
}
public static void main(String[] args) {
   A("");
   B();
    System.out.println(B());
}
}