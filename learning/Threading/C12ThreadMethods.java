package learning.Threading;
class ThreadMethods extends Thread{
    public void run(){
        System.out.println("lala");
    }
}
public class C12ThreadMethods {
    public static void main(String[] args) {
        ThreadMethods t1 = new ThreadMethods();
        t1.start();
        //join method is used to stop the other thread until the first thread is executed
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        ThreadMethods t2 = new ThreadMethods();
        t2.start();
    }
}
