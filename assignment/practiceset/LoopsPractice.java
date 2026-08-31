package assignment.practiceset;

public class LoopsPractice {
    public static void main(String[] args) {
        // this is practice set 5

        // Write a program to print the following pattern :

        // ****

        // ***

        // **

        // *
        int n = 5;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Write a program to sum first n even numbers using a while loop.
        int sum = 0,i=0;
        while (i<n) {
            sum += 2*i;
            i++;
        }
        System.out.println(sum);

        //Write a program to print the multiplication table of a given number n.
        int table = 2;
        for(i = 1 ; i<=10;i++){
            System.out.printf("2 * %d = %d",i,(2*i));
            System.out.println("");
        }
        System.out.println("\n\n");
        //Question 4: Write a program to print a multiplication table of 10 in reverse order.
        for(i = 10 ; i>=1;i--){
            System.out.printf("10 * %d = %d",i,(10*i));
            System.out.println("");
        } 
        
        //Question 5: Write a program to find the factorial of a given number using for loops.
        int fact = 10;
        int fac_total=1;
        for(i=1;i<=fact;i++){
            fac_total *= i;  
        }
        int using_while=1;
        i=1;
        while(i<=fact){
            using_while *= i;
            i++;
        }
        System.out.println(fac_total);
        System.out.println(using_while);
        int j=0;
        int ii=n;
        System.out.println("the value of n is "+n);
        while (ii>0) {
            while (j<ii) {
                System.out.print("*");
                j++;
            }
            j=0;
            System.out.println("");
            ii--;
        }
        //Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        n=8;
        sum=0;
        for(i=0;i<10;i++){
            sum+= (8*(i+1));
        }
        System.out.println(sum);
        // Repeat problem 2 using for loop.
        n=5;
        i=0;
        sum=0;
        while (i<n) {
            sum += (i*2);
            i++;
        }
        System.out.println(sum);
    }
}
