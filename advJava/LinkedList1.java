package advJava;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        //extra method
        l1.addLast(50);
        System.out.println(l1);
        l1.addFirst(50);
        l1.add(1,30);
        System.out.println(l1);

    }
}
