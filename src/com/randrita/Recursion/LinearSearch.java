package com.randrita.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        int[] arr1={3,2,3,18,3};
        System.out.println(linearSearch(arr,18,0));
        linearSearchList(arr1,3,0);
        System.out.println(list);
    }

    static int linearSearch(int[] arr,int target,int index){
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearchList(int[] arr,int target,int index){

        if(index>arr.length-1){
            return;
        }
        if(arr[index]==target){
           list.add(index);
        }
        linearSearchList(arr, target, index+1);
    }
}
