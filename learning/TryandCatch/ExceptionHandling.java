package learning.TryandCatch;

public class ExceptionHandling {
    public static void main(String[] args) {
        int b=10;
        try {
           int a;
           System.out.println(10/0); 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
