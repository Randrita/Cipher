package com.randrita.array;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[5];
        Scanner input = new Scanner(System.in);

        //take the array input
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        //displaying the input array
        System.out.println("\nThe original array:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        Maxi maximum = new Maxi();
        Mini minimum = new Mini();
        System.out.println("\nThe maximum number presents in the given array: "+maximum.Maxi(arr1));
        System.out.println("The minimum number presents in the given array: "+minimum.Mini(arr1));

    }

}

class Maxi{
    public int Maxi(int[] arr1) {
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }

        }
        return max;
    }
}

class Mini{
    public int Mini(int[] arr1) {
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i]<min) {
                min = arr1[i];
            }

        }
        return min;
    }
}


