package com.randrita.Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int[] arr1 = {4,3,2,1};
        reverse(arr1,0,3);
    }

    public static void reverse(int[] arr,int l,int r){
        //base condition
        if(l>=r){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(arr,l+1,r-1);
    }

}
