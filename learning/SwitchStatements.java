package learning;
import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        //elseif and switch statements
        //elseif
        /* 
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter your age");
        a= sc.nextInt();
        if (a>=60) {
            System.out.println("you are senior citizen");
        }
        else if(a< 50 && a> 18){
            System.out.println("you are adult");
        }else{
            System.out.println("you are younger");
        }
            */
        //switch is used when we have to make choice
        int age =10;
        switch (age) {
            // case 18:
            //     System.out.println("you are adult");
            //     break;
            // case 24:
            //     System.out.println("now you can marry");
            //     break;
            // yoyu cannot use the statement at a time if u use old method u shoud 
            //have to use the old  or new one choice is yours
            case 25 -> System.out.println("you are now 25");// this is the enhance version of switch
            default->{
                System.out.println("enjoy your life");
                System.out.println("lalalal");
            }
        } 
    }
}
