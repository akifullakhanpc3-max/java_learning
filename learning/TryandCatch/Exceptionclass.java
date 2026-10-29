package learning.TryandCatch;
class MyException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "i am to string";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }
}
//throws is given to a methpd that states that this method may give exception
        //handle by own
        

public class Exceptionclass {

    public static int devide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("b is not should be zeroooo");
        }
        return a/b;
    }
    public static void main(String[] args) {
        //exception class is used to create a custom exception class
        //it will be create using inheriting the props of Exception and 
        //we can override the methods
        int a=99;
        if(a<100){
            try {
                throw new MyException();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());//run message method
                System.out.println(e);//run to string
                System.out.println(e.toString());
                e.printStackTrace();//used for color and trace
            }
        } else{
            return;
        }
        
        
    }   
}
