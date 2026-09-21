package practiceset.Chapter13;
class Mythread extends Thread{
    public void run(){
        System.out.println("hii there i am a thread");
    }
}
public class Problem3 {
    public static void main(String[] args) {
        // Demonstrate getPriority and setpriority methods in java threads
        Mythread t1 = new Mythread();
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
    }
}
