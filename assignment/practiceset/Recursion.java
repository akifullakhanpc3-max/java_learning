package assignment.practiceset;

public class Recursion {
    static void mul(int table) {
        for (int i = 1; i != 11; i++) {
            System.out.println(table + " * " + i + " = " + (table * i));
        }
    }

    static int sum(int a) {
        if (a == 0) {
            return 0;
        }
        return a + sum(a - 1);
    }

    static int fibonacci(int a) {
        if (a == 0 || a == 1)
            return a;
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    static int avg(int... arr) {
        int average = 0;
        for (int i : arr) {
            average += i;
        }
        average /= arr.length;
        return average;
    }

    // c to f
    static float CtoF(int a) {
        if (a == 0)
            return 32;
        float result = (a * 9 / 5.0f) + 32;
        return result;
    }

    static void pattern(int a) {
        int n = a;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void reverse(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Write a Java method to print the multiplication table of a number n.
        // mul(10);

        // Write a program using functions to print the following pattern:

        int n = 5;
        pattern(4);

        System.out.println("reverse");
        reverse(5);

        // Write a recursive function to calculate the sum of first n natural numbers.
        int result = sum(4);
        System.out.println(result);

        // Write a function to print the nth term of the Fibonacci series using
        // recursion.
        for (int i = 0; i < n; i++) {
            // System.out.println(i);
            System.out.println(fibonacci(i));
        }

        // Write a function to find the average of a set of numbers passed as arguments.
        System.out.println(avg(10, 20));

        // Write a function to convert Celsius temperature into Fahrenheit.
        System.out.println("celcius to F");
        System.out.println(CtoF(26));

    }
}
