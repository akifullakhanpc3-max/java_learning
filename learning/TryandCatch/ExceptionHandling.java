package learning.TryandCatch;
import java.util.*;
class Sample{
    void add(){
         int b=10;
        try {
           int a;
           System.out.println(10/0); 
           try{

           }catch(Exception e){

           }
        } catch (Exception e) {//(Exception ,ArithmeticException,ArrayIndexOutOfBoundsException) capturing specific exception
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        //check and unchecked exception
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        try{
            System.out.println("enter the array elemets");
            for(int i=0;i<n+1;i++){
                arr[i]= sc.nextInt();
            }
        }catch(Exception e){
            System.out.println("array out of range");
            System.out.println(e);
        }
        for(int i: arr){
            System.out.println(i);   
        }
    }
}
