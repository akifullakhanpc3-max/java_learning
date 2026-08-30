package assignment.practiceset;
import java.util.Scanner;

public class Practiceset3 {
    public static void main(String[] args) {
        // convert a string to lower case
        // Scanner sc = new Scanner (System.in);
        // String str = new String();
        // str = "AKIF";
        // System.out.println(str +" "+ "is converted "+ str.toLowerCase());
        // System.out.println( );

        // String str2 = "akif khan";
        // System.out.println(str2.replace(" ", "_"));

        // String str3 = new String ();
        // System.out.println("write a string to add in a statemnet");
        // str3 = sc.next();
        // System.out.println("Dear " + str3 + " thanks a lot");
        // System.out.println("enter the replace string");
        String str3 = new String();
        str3  = "Dear name, thanks a lot";

         String str3_replace = new String();
         str3_replace= str3.replaceAll("name", "Akif") ;
        // str2 = str2.replace(Str3, str3_replace);  
        
        System.out.println(str3_replace); 
        //problem 4 to find double and triple spcaes
        String mystr = "this string contains double and  triple spaces";
        System.out.println(mystr.indexOf("   "));
        System.out.println(mystr.indexOf("  "));

        //write a program to format the follwoung letter 
        // usafe escase sqquence charactes

        String letter ="Dear harry,\n\tthis java course is nice.\nThanks! ";
        System.out.println(letter);
    }
}