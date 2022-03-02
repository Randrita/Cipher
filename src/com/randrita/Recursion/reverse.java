package com.randrita.Recursion;
//array reversal using recursion

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int index=0;
        recReverse(arr,index);
        System.out.println(Arrays.toString(arr));
    }

    static void recReverse(int[] arr,int i){
        int n= arr.length;
        //int i=0;
        //base case
        if(i>=n/2){
            return;
        }

        //swap
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        //i+=1;
        //recursive call
        recReverse(arr,i+=1);
    }

}
