package learning;
class C10Base12{
    void name(){
        System.out.println("this is base class");
    }
    void greet(){
        System.out.println("goodmorning");
    }
}
class C10Derived12 extends C10Base12{
    @Override
    void name(){
        System.out.println("this is derived class");
    }
    void lala(){
        System.out.println("this is lala");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        C10Base12 c1 = new C10Base12(); 
        C10Derived12 d1 = new C10Derived12();  // this carry all the features of Base

        d1.name();
        //we can create the obj by using parent class and reference of base class and the object is derived class
        C10Base12 obj = new C10Derived12();
        obj.name();
        //it carry all the methods of base class if the reference is Base class but
        //we cannot run the methods of sub class
        
        
        //obj.lala(); -- it wont run

        //and we cannot all soo create a object by using subclass reference and object of super class
    }
}
