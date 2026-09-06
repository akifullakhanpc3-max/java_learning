package learning;
class C10Base1{
    private int x;
    C10Base1(int x) {
        this.x = x;
        System.out.println(x);
    }
    public int getX() {
        return x;
    }
    C10Base1(){
        
    }
}

class C10Derived1 extends C10Base1{
    C10Derived1( int a){
        super(a);
        System.out.println(" akifulla khan"+ a);
    }
    @Override
    public int getX() {
        // TODO Auto-generated method stub
        
        System.out.println(super.getX());
        return super.getX();
    }
}

class C10ThisSuper{
    public static void main(String[] args) {
        C10Base1 c1 = new C10Base1(60);
        System.out.println(c1.getX());
        C10Derived1 c2 = new C10Derived1(5);
        c2.getX();
    }
}