package learning;

public class Recursion {
    static int fac(int a){
        if(a == 0 || a==1){
            return 1;
        }else
            return a * fac(a-1);
            //4*3*3*2*1*1   
    }
    static int fibanacci(int a){
        if(a==0 || a==1){
            return a;
        }
        return fibanacci(a-1)+ fibanacci(a-2);
    }
    public static void main(String[] args) {
        System.out.println(fac(4));
        int n=4;
        for(int i=0;i<n;i++){
            System.out.println(fibanacci(i));
        }
    }
}
