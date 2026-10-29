package anonymous;

interface demo{
    int add();
    void disp();
}
interface demo1{
    void disp();
}

public class lamdaexpression {
    public static void main(String[] args) {
        //anonymous class
        demo d1 = new demo() {
            @Override
            public int add() {
                // TODO Auto-generated method stub
                return 0;
            }
            @Override
            public void disp() {
                // TODO Auto-generated method stub
                System.out.println("hii there");   
            }
        };
        //lamda expression 

        demo1 d2 = ()->{
            System.out.println("lala");
        };
        d2.disp();
    }    
}
