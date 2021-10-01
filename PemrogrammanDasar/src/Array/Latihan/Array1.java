package Array.Latihan;

import java.util.ArrayList;

public class Array1 {
        
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println(list);
        
        list.remove(0);
        
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        
        System.out.println(list.contains(10));
        System.out.println(list.contains(15));
        
        list.clear();
        
        System.out.println(list);
        System.out.println(list.size());
    }   
}