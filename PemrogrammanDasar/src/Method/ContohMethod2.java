package Method;

public class ContohMethod2 {

//cara 1
    
//    void greet(String[] names){
//        for(String name : names) {
//            System.out.println("Hello " + name);
//        }
//    }
  
    //1
    
//    public static void main(String[] args) {
//        ContohMethod2 c = new ContohMethod2();
//        String[] names = {"Adi", "Budi", "Ciko", "Doni"};
//        
//        c.greet(names);
//    }
//}
    
    
   //2
//
//    public static void main(String[] args) {
//        ContohMethod2 c = new ContohMethod2();
//
//        c.greet(new String[]{"Adi", "Budi", "Ciko", "Doni"});
//    }
//}

//cara 2
    
    void greet(String... names){
        for(String name : names) {
            System.out.println("Hello " + name);
        }
    }
    
    public static void main(String[] args) {
        ContohMethod2 c = new ContohMethod2();

        c.greet("Adi", "Budi", "Ciko", "Doni");
    }
}