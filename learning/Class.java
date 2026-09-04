package learning;

class NewClass{
    private int id;// attributes
    private float a =10.00f ; 
    String name  = "akif";
    void add(){//methods
        System.out.println("name : " + name);
        System.out.println(a);
    }
}


public class Class {
    public static void main(String[] args) {
        //in one java file we have only one java public class
        NewClass obj1 = new NewClass(); //createing a new object here
        obj1.add();

    }
}
