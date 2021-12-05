package com.randrita.array;
/*Given an array which consists of only 0, 1 and 2.
Sort the array without using any sorting algo*/

import java.util.Arrays;

public class array0s1s2s {
    public static void main(String[] args) {

        int[] n ={1,2,1,2,0,0,0,1};
        System.out.println("The Given Array: "+ Arrays.toString(n));
        array0s1s2s objF = new array0s1s2s();
        objF.sort(n);
    }

    public void sort(int[] num){
        int low=0;
        int high=num.length-1;
        int mid=0;
        int temp;

        while(mid<=high){
            switch (num[mid]){
                case 0:
                    temp=num[low];
                    num[low]=num[mid];
                    num[mid]=temp;
                    low+=1;
                    mid+=1;
                    break;

                case 1:
                    mid+=1;
                    break;

                case 2:
                    temp=num[mid];
                    num[mid]=num[high];
                    num[high]=temp;
                    high--;
                    break;

            }
        }
        System.out.println("The Sorted Array: "+Arrays.toString(num));
        System.out.println("----Using Three Pointer Method----");
    }

}
