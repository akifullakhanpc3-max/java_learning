package learning;

public class VariableArguments {
    // static int sum(int a, int b){
    //     return a+b;
    // }

    //syntax static void foo(int ...arr) it copy all the arguments
    static int sum(int x,int ...arr){
        //int []arr;
        int result=x;
        for (int i : arr) {
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        //
        System.out.println("welcome to var args tutorials ");
        System.out.println(sum(0));
        System.out.println("the sum of 4 and 5 is " + sum(4, 5,6,7,5));
    }
}
