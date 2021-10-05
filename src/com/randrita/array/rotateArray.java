package com.randrita.array;

import java.util.Arrays;

public class rotateArray {

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        Solution objNew= new Solution();

        objNew.rotate(nums,3);

    }

}


class Solution {
    public void rotate(int[] nums, int k) {


        int N=nums.length;
        int n= N-1;

        //reverse part 1
        reverse(nums,0,n-k);

        //reverse part 2
        reverse(nums,N-k,N-1);


        //reverse the array
        reverse(nums,0,N-1);
        System.out.println(Arrays.toString(nums));

    }

    public static void reverse(int[] nums,int i,int j){

        int temp;
        int l=i;
        int h=j;
        while(l<h){
            temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;

            h--;
            l++;
        }
    }
}