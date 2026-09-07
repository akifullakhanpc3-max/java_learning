package learning;

/**
 * C11Interface
 */




interface Bicycle{
    //we cannot create the objects but we can implements the class
    // can create the properties but cannot modify the properties
    public final int a =45;
    public abstract void speedup(int speed);
    public abstract void breaks(int decrement);
    default void add(){
        System.out.println("kask");
    }//it allows to develop ub unterface 
    //default methods
    //we can create the private methods in interface
}
class Avoncycle implements Bicycle{
    private int speed = 7;

    public void speedup(int speed){
        this.speed += speed;
    }
    public void breaks(int decrement){
        this.speed -= decrement;
    }
}

public class C11Interface {
    public static void main(String[] args) {
        //all the methods are abstract in interface
        //a group of related method with empty bodies
        //if we want to use we have to use implement
        //we can implements multiple interface
    }
}