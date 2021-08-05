package com.randrita.array;
//find Largest sum contiguous Subarray [V. IMP]//

public class LargestSum {
    public static void main(String[] args) {

        int[] arr={5,-4,-2,6,10};
        contagious arrCount = new contagious();
        arrCount.sum(arr);
    }
}

class contagious{
    public void sum(int[] arr){
        int CountSum=0;
        int MaxSum=0;

        for(int i=0;i<arr.length;i++){
            CountSum=CountSum+arr[i];

            if(CountSum>MaxSum){
                MaxSum=CountSum;
            }

            if(CountSum<0){
                CountSum=0;
            }
        }
        System.out.println(MaxSum);
    }
}
