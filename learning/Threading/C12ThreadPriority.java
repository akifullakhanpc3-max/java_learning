package learning.Threading;

// min  default 1
 //normal 5
 //max =10

class ThreadPriority extends Thread{
    ThreadPriority(String name){
        super(name);
    }
    public void run(){
        while (true) {
            System.out.println(this.getName());
        }
        //System.out.println(1);
    }
} 
public class C12ThreadPriority {
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority("1");
        ThreadPriority t2 = new ThreadPriority("2");
        ThreadPriority t3 = new ThreadPriority("3");
        ThreadPriority t4 = new ThreadPriority("4");
        ThreadPriority t5 = new ThreadPriority("5");
        t5.setPriority(Thread.MAX_PRIORITY);
        //norm_prioprity
        //min_priority
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
