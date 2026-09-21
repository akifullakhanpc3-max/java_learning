package practiceset.Chapter13;

class Problem1 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class Problem2 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}
public class problem1 {
    public static void main(String[] args) {
        //write a program to print ""good morning" and "welcome"
        //Continuously on the screen in java using thread

        Problem1 t1 = new Problem1();
        Problem2 t2 = new Problem2();
        
        t1.start();
        t2.start();
    }
}
