package learning.Threading;

class C12MyThread extends Thread{
    C12MyThread(String name){
        //a name given to the thread
        super(name);
    }
    //.getId gives the id of the thread
    //.getName give the name of the thread 
    //ThreadGroup is used to create a group
    C12MyThread(Runnable r){
        super(r);
    }
    public C12MyThread(ThreadGroup group, String name){
        
    }

    public void run(){

    }
}
public class C12ThreadConstructor {
    public static void main(String[] args) {
        C12MyThread t = new C12MyThread("akif");
        System.out.println(t.getId());
        System.out.println(t.getName());
    }
}
