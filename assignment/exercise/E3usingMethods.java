package assignment.exercise;
import java.util.Random;
import java.util.Scanner;

class RandomNumber1{
    
    private int computer;
    Random number = new Random();
    RandomNumber1(){
        computer = number.nextInt(100);
    }
    
    private int guess;
    void setGuess(int a){
        guess = a;
    }
    int getComputer(){
        return computer;
    }
    int getGuess(){
        return guess;
    }
    boolean isCorrect(){
        if(guess == computer){
            return true;
        }
        return false;
    }
}

public class E3usingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to guess with the computer:");
        int a ;
        int count=0;
        RandomNumber1 r = new RandomNumber1();
        int computerGuess = r.getComputer();
        boolean iscorrect = false;
        String ans;
        while(!iscorrect){
            System.out.println("enter the number to b gussed");
            System.out.println(computerGuess);
            
            a=sc.nextInt();
            r.setGuess(a);
            count++;
            iscorrect = r.isCorrect();
            ans = (r.getGuess()< computerGuess)?"greater ":"lesser";
            if(iscorrect){
                System.out.println("you gussed the ans");
            }else{
                System.out.println(ans);
            }
         
        }
           System.out.println("you gussed the ans by taking "+count+" steps");
    }   
}
