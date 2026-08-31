package assignment.exercise;

import java.util.Random;
import java.util.Scanner;

public class Rockpaper {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int play=1;
        while (play == 1) {
            System.out.println("1.play 2.stop");
            play = sc.nextInt();
            if (play == 1) {
                
            int a = r.nextInt(1, 4);
            System.out.println(a);
            System.out.println("enter your choice \t\n 1.Rock \t\n 2.Paper \t\n 3.Sizzer \n enter only number");
            int choice = sc.nextInt();
            if ((a == choice)) {
                System.out.println("tie");
            } else {
                switch (choice) {
                    case 1:
                        if (a == 2) {
                            System.out.println("paper");
                            System.out.println("loose");
                        } else {
                            System.out.println("Scizzer");
                            System.out.println("won");
                        }
                        break;
                    case 2:
                        if (a == 1) {
                            System.out.println("rock");
                            System.out.println("won");
                        } else {
                            System.out.println("Scizzer");
                            System.out.println("loose");
                        }
                        break;
                    case 3:
                        if (a == 2) {
                            System.out.println("paper");
                            System.out.println("won");
                        } else {
                            System.out.println("rock");
                            System.out.println("loose");
                        }
                        break;
                    default:
                        break;
                }
            }
            }else{
                System.out.println("thanks for playing");
            }
        }
        // Akif lala = new Akif();
        // lala.akif();
    }

}

class Akif {
    int akif() {
        System.out.println("this is from akif");
        return 0;
    }

}
