package learning;

class C10Base{
    int x;
    C10Base(){
        System.out.println(" i am  a constructor");
    }
    C10Base(int a){
        System.out.println("lalal");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class C10Derived extends C10Base{
    int y;
    // if we declared the constructor in  both class the base constructor will execute first 
    C10Derived(){
        //by entering th e super key word we can use the argumet of parent class 
        super(0);
        System.out.println("i am a derived class");
    }

    //if we overload the constructor 
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}


public class C10ConstructorInheritance {
    public static void main(String[] args) {
        //C10Base b1 = new C10Base();
        C10Derived d1 = new C10Derived();
    }   
}
