package practiceset.Chapter13;
class MyThread1 extends Thread{
    public void run(){
        //System.out.println(this.getState());
        System.out.println("hiit there i am using this threads");
    }
}
public class Problem4 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

    }    
}
