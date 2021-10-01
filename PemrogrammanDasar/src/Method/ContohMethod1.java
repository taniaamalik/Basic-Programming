package Method;

public class ContohMethod1 {
    void hello(String name){
        System.out.println("Hello" + name);
    }
    void ok(){
        hello("");
                }
    public static void main(String[] args) {
        //INSTANSIASI
        ContohMethod1 cm = new ContohMethod1();
        cm.hello("Tania");
        cm.ok();
    }
    }
