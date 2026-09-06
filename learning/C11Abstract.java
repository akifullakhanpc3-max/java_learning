package learning;

abstract class C10Abstract {
    C10Abstract(){
        System.out.println("i am a constructor");
    }
    void Hello(){
        System.out.println("hello");
    }
    abstract void greet();//we can override this method for sub class
    //it is mandatory we have to this abstract methods
    // in the derived class if we dont wat we 
    //have to declare the derived class as abstract class 

}

class C10Sub extends C10Abstract{
    @Override 
    public void greet(){
        System.out.println("hello");
    }
}

public class C11Abstract {
    public static void main(String[] args) {
        //abstract class is a class which only exist like khayal(thought)
        //a method is declared without an implementation is called abstract method
        // a class which having abstract method is called abstract class
        // we cannot declare a object for abstract parent class if we want to declare we 
        //have to implement the abstract method in object
        C10Abstract a= new C10Abstract() {
            void greet(){

            }   
        };        
    }
}
