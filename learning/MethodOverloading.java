package learning;

public class MethodOverloading {
    //@overloading
    static void foo(){
        System.out.println("good morning");
    }
    //@overloading
    static void foo(int a){
        System.out.println(a);
    }
    //@overloading
    static void foo(int a,int b){
        System.out.println(a+""+b);
    }
    public static void main(String[] args) {
        foo();
        foo(0);
        foo(10,20);
    }
}
