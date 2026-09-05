package assignment.exercise;
import java.util.Random;
import java.util.Scanner;

class RandomNumber{
    //Scanner sc = new Scanner(System.in);
    Random r= new Random();
    private int number ;
    private int guess;
    RandomNumber(){
        number = r.nextInt(0,100);
    }
    int GetNumber(){
        return number;
    }
    void setUser(int a){
        guess = a;
    }
    // boolean isCorrect(){
    //     return true;
    // }

}

public class E3GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the random number ");
        int guess;
        System.out.println("enter your number ");
        guess = sc.nextInt();
        RandomNumber number = new RandomNumber();
        while (guess != number.GetNumber()) {
            //System.out.println(number.GetNumber());
            if(guess<number.GetNumber()){
                System.out.println("the number is bigger than your guess");
            }else if(guess>number.GetNumber()){
                System.out.println("the number is smaller that your guess");
            }
            System.out.println("re enter the number");
            guess = sc.nextInt();

        }
        if(guess == number.GetNumber()){
            System.out.println("you found it ");
        }


        // //guessing through methods
        // System.out.println("setting through methods");
        // number.setUser(guess);

    }
}
