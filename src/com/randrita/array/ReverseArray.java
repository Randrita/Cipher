package com.randrita.array;
import java.util.Scanner;

//Reverse a Given Array

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare the array
        int[] arr = new int[5];

        //take the array input
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        //displaying the input array
        System.out.println("The original array:");
        for(int num:arr){
            System.out.print(num+" ");
        }

        //reversing the array
        System.out.println("\nThe reverse array:");
        for(int i = arr.length-1;i>=0;i-- ){
            System.out.print(arr[i]+" ");
        }

    }
}
