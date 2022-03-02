package com.randrita.DynamicProgramming;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int[] dp=new int[5+1];
        Arrays.fill(dp,-1);
        System.out.println(fibonacci(5,dp));
    }

    static int fibonacci(int n,int[] dp){
        if(n<=1)
        {
            return n;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        return dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
    }
}
