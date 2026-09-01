package learning;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // declaration of array
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of an array");
        int n;
        n= sc.nextInt();
        int [] a = new int[n];
        System.out.println("enter the elements of an array");
        for(int i =0 ; i< n;i++ ){
            a[i]= sc.nextInt();
        }
        System.out.println("the elemets of an array are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

        //accessing the elements of an array
        // we can acces the the array using index values 
        //for example
        System.out.println("the value of array having 5th position is "+a[4]);
        // to find the array length
        //we can go with .length
        System.out.println("the length of an array is"+a.length);

        // retriving the array elements using for each loop
        System.out.println("using foreach loop");
        for (int ele : a) {
            System.out.println(ele);
        }
    }   
}
