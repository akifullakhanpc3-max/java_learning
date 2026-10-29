package assignment.practiceset;
import java.util.Scanner;
class Maxarr extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "reached max exception";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "lalal";
    }
    static void lala() throws ArithmeticException{
        
    }
}

public class Finally {

    public static void main(String[] args) {
        Maxarr m1 = new Maxarr();
        try {
            int a = 200/0;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        int [] arr = new int[5];
        boolean flag = true;
        int i=0;
        while (flag) {
            try {
                if(i>arr.length-1)
                    throw m1;
                arr[i] =new Scanner(System.in).nextInt(); 
        } catch (Exception e) {
            // TODO: handle exception
            flag = false;
            System.out.println( m1.getMessage());
            m1.toString();
            System.out.println(e); 
            System.out.println("invalid index");
            break;
        }
        i++;
        }
        System.out.println("hii");
    }
}
