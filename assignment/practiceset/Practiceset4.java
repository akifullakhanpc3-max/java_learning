package assignment.practiceset;
import java.util.Scanner;

public class Practiceset4 {
    public static void main(String[] args) {
        //What will be the output of this program:
        Scanner sc= new Scanner(System.in); 
        int a = 10;
        if (a == 11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");

        //Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
        /*int sub1,sub2,sub3, total_marks ;
        System.out.println("enter the student marks of student of each subject");
        System.out.println("enter your marks in chem");
        sub1= sc.nextInt();
        System.out.println("enter your marks in maths");
        sub2= sc.nextInt();
        System.out.println("enter your marks in physics ");
        sub3= sc.nextInt();
        total_marks = (sub1+sub2+sub3)/3;
        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && total_marks >= 40 ) {
            System.out.println("Congratulation, you passed");
        }else{
            System.out.println("fail");
        }*/

        //Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        
        /* 
        float sal;
        System.out.println("enter you salary in lacks");
        sal = sc.nextFloat();
        System.out.println(" your income is");
        float tax;
        if (sal >2.5 && sal<5.0) {
            tax = sal -(sal * 95/100);
        }else if( sal >= 5.0 && sal <10.0){
         tax = sal -(sal * 95/100);
            int tax1 = sal -(sal * 80/100);
        }else{
            tax = sal -(sal * 70/100);
        }
        System.out.println("your tax amount is " + tax + " lacks");
        */

        //Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
        /*int day;
        System.out.println("enter the week number");
        day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("enter the correct day form 1 to 7");
        }*/


        //weather a year is leap or not
        /* 
        System.out.println("weather a year is leap year or not");
        int year ;
        System.out.println("enter the year");
        year = sc.nextInt();
        if((year%400 ==0 ) || (year%4==0 && year%100 !=0)   ){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }*/

        String str;
        System.out.println("enter the url");
        str=sc.nextLine();
        if(str.endsWith(".com"))
            System.out.println("commercial");
        else if(str.endsWith(".org"))
            System.out.println("organization");
        else if (str.endsWith(".in")) {
            System.out.println("indian website");
        }
        else
            System.out.println("enter the correct url");
    }
}
