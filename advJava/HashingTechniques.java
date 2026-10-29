package advJava;
import java.util.HashSet;

public class HashingTechniques {
    //it is a  technique which is used to range a key value pair 
    //it is used to faster fetch and faster insertion
    //this technique uses hash function f(x)= x%20
    //from that f(x) =  index and x is the value
    //hashing shows the in index in the array
    //hash collision
    //open addressing is a technique is used to handle collision
    //chaining is also a technique which is used to handle the technique which links to a linked 
    //loadfactor -- if the haset is full it will increase the size
    public static void main(String[] args) {
        HashSet<Integer> h1 =  new HashSet<>();
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(40);
        h1.add(50);
        System.out.println(h1);
    } 
}
