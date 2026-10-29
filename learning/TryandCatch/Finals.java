package learning.TryandCatch;

public class Finals {
    static int a(){
        try {
            int x=10;
            return x;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        finally{
            System.out.println("cleaning up resources");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(a());
    }
}
//it is used to for cleaning up resources;
//it workds best with in a try block there is a return statement 
//it executes the finally block alsoo
