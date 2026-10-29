package advJava;

import java.util.ArrayDeque;

public class ArrayDequeus1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        //insertion and deletion in both the ends
        //add at the end of the queus
        //addAll at the end
        //addFirst
        //addLast
        //push pop
        //getFirst and getLast
        d1.add(10);
        d1.add(20);
        
        d1.addFirst(30);
        d1.addLast(50);
        System.out.println(d1);


    }   
}
