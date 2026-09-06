package learning;
class C10Base2{
    public int harry(){
        return 4;
    }
    public int harry1(){
        return 4;
    }
}

class C10Derived extends C10Base2{
    @Override
    public int harry1(){
        return 5;
    }
}

public class C10Overriding {
    public static void main(String[] args) {
        
    }
}
