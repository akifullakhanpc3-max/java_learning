package assignment;
import java.util.*;

public class CbsePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1,s2,s3,s4,s5,s6;
        System.out.println("enter the marks in order of pcmb and lan1 and lan2 and total marks will be hundred:");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();
        s6 = sc.nextInt();
        int total = s1+s2+s3+s4+s5+s6;
        float per = (100f/600)*total;
        System.out.println("the percentage is : "+  per);
    }    
}
