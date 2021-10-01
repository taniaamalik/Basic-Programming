package Method;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Fib(i) + " ");
        }
    }
    public static int Fib(int x){
        int a;
        if (x<=1){
            return x;
        } else {
            a = Fib(x-2)+Fib(x-1);
            return a;
        }
    }
}