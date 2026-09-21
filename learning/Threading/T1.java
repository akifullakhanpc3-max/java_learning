package learning.Threading;
class MyThead extends Thread {
    // this is creating the inheritance of thread class
    @Override 
    public void run(){
        System.out.println("my thread is running");
    }
}
//thread is creating using runnable interface
class ByImplemts implements Runnable{
    public void run(){
        System.out.println("lala");
    }
} 
public class T1 {
    public static void main(String[] args) {
        // we can use the thrad by using thread class using einheritance and 2nd option is runnable interface
        MyThead t1 = new MyThead();
        t1.start();
        // if we are using interface thread we have to create a tgread object

        ByImplemts t2 = new ByImplemts();
        Thread thread1 = new Thread(t2);
        thread1.start();

        
        //thread1.stop();
    }
}
