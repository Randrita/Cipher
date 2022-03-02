package com.randrita.DynamicProgramming;
import java.util.*;

public class FrogJump {

    public static void main(String[] args) {
        int n=8;
        int[] heights={7, 4, 4, 2, 6, 6, 3, 4 };
        System.out.println(frogJump(n,heights));
    }
    public static int frogJump(int n, int heights[]) {
        // Write your code here
        int[] dp=new int[n+1];
        return f(n-1,heights,dp);
    }

    static int f(int n,int[] h,int[] dp){
        //base case
        if(n==0){return 0;}
        //dp_check
        if(dp[n]!=0){
            return dp[n];
        }
        //recursive call
        int lh=f(n-1,h,dp)+Math.abs(h[n]-h[n-1]);
        int rh=Integer.MAX_VALUE;
        if(n>1){
            rh=f(n-2,h,dp)+Math.abs(h[n]-h[n-2]);
        }
        return dp[n]=Math.min(lh,rh);
    }

}