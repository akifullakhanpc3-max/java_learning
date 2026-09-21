package practiceset.Chapter13;

class Problem1 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class problem2 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        //add a sleep method in welcome thread of question 1 to delay its 
        //executuion for 200ms

        
        Problem1 t1 = new Problem1();
        problem2 t2 = new problem2();

        t1.start();
        t2.start();
    }
}
