package assignment.practiceset;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create an array of 5 floats and calculate their sum.
        float[] arr ={10.2f,23.01f,8.6f,8.4f,9.3f};
        float sum=0;
        for (float ele : arr) {
            sum += ele;
        }
        System.out.println("the sum of array elements : " + sum);
        
        
        //Create an array of 5 floats and calculate their sum.
        int key;
        boolean keyfound = false;
        System.out.println("enter the key to search");
        key = sc.nextInt();
        int[] keyfind = {15,26,74,96,42};
        for (int ele : keyfind) {
            if(ele == key)
            {
                keyfound = true;
                break;
            }
        }
        if (keyfound) {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }


        //Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        System.out.println("enter the number of marks");
        int n;
        n= sc.nextInt();
        int[] marks= new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        //calculating avg
        float avg=0,total=0;
        for (int i : marks) {
            total+=i;
        }
        avg = sum/n;
        System.out.println("the avg of marks is : "+avg);
        
        
        //Create a Java program to add two matrices of size 2x3.
        int [][] mat1 = {{1, 2, 3},{4, 5, 6}};
        int [] [] mat2= {{1,2,3},{4,5,6}};
        int [][] res = {{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0; j<mat1[i].length;j++){
                res[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        
                        
        

        //Write a Java program to reverse an array.
        int temp=0;
        for(int i=0;i<(marks.length/2);i++){
                temp = marks[i];
                marks[i]= marks[marks.length-1-i];
                marks[marks.length-1-i] = temp;
        }
        System.out.println("reverse an array");
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }

        //Write a Java program to find the maximum element in an array.
        float max=0;
        for(int i=0;i<n;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("maximum"+max);

        //Write a Java program to find the minimum element in an array.
        float min=marks[0];
        for(int i=0;i<n-1;i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }
        System.out.println("minimum"+min);

        //Write a Java program to find whether an array is sorted or not.
        for(int i=0;i<n-1;i++){
            if(marks[i]>marks[i+1]){
                System.out.println("the array is not sorted");
                break;
            }else{
                System.out.println("array is sorted");
            }
        }
    }
}
