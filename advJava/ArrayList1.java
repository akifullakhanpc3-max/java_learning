package advJava;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l1);
        //to get a size of a list we have to use .size method
        //to get a element we have to use .get method

        for(int i = 0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        //to update at an index we have can
        l1.add(1,30);
               //index,value
        System.out.println(l1);  

        //to add one array list to another we have to use .addAll() method
        l1.addAll(l2);
        System.out.println(l1);

        //clear remove all the elements
        //clone is used to clone a list
        l2= (ArrayList<Integer>)l1.clone();
        l1.clear();
        System.out.println(l2);
        System.out.println(l1);

        //contains check the specific element is there or not if it is there it returns false else true
        //indexOf() return the index pf that element
        //lastIndex
        //remove 
        //set is used to update the element
         
    }
}
