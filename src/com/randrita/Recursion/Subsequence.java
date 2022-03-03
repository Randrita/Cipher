package com.randrita.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        int i=0;
        ArrayList<Integer> list=new ArrayList<>();
        allSubsequence(i,arr,list);
    }

    static void allSubsequence(int i, int[] arr,ArrayList<Integer> list){
        if(i>=arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        allSubsequence(i+1,arr,list);
        list.remove(list.size()-1);
        allSubsequence(i+1,arr,list);

    }
}
