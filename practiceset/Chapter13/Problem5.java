package practiceset.Chapter13;
class Mythead extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        System.out.println("hii there i am using the thread");
    }
}
public class Problem5 {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        //System.out.println(t1.currentThread());
        t1.start();
    }
}
