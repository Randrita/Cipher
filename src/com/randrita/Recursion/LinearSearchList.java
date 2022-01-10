package com.randrita.Recursion;

import java.util.ArrayList;

public class LinearSearchList {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,1};
        ArrayList<Integer> cool = new ArrayList<>();
        System.out.println(findElement(arr,1,0,cool ));
        //System.out.println(findElementBody(arr,1,0));
    }

    //when arraylist is in parameter
    static ArrayList findElement(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index>=arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);

        }
        return findElement(arr,target,index+1,list);
    }

    //when arrayList in body
    static ArrayList findElementBody(int[] arr,int target,int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index>=arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> naya= findElementBody(arr,target,index+1);
        list.addAll(naya);
        return list;
    }
}
