package com.randrita.Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(30205,0));
    }

    static int countZero(int n,int count){
        if(n<=0){
            return count;
        }

        if(n%10==0){
            return countZero(n/10,count+=1);
        }

        return countZero(n/10,count);

    }
}
