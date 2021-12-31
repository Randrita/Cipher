package com.randrita.Recursion;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return sumDigits(n/10)+n%10;
    }
}
