package com.randrita.array;

import java.util.Arrays;

public class Negative {
    public static void main(String[] args) {
        int[] newArray= {-1,2,3,-4,5,-7};
        System.out.println("The given array: "+Arrays.toString(newArray));
        Negative arrayObj = new Negative();
        arrayObj.negativeOneSide(newArray);
    }

    public void negativeOneSide(int[] arr){
        int low=0;
        int high= arr.length-1;
        int temp;

        while(low<high){
            if (arr[low]<0 && arr[high]>0){
                high-=1;
                low+=1;
            }

            else if (arr[low]>0 && arr[high]<0){
                temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                low+=1;
                high-=1;
            }

            else if(arr[low]<0 && arr[high]<0){
                low+=1;
            }

            else{
                high-=1;
            }
        }
        System.out.println("The required array is: "+ Arrays.toString(arr));
    }
}
