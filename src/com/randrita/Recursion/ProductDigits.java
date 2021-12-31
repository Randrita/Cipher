package com.randrita.Recursion;

public class ProductDigits {
    public static void main(String[] args) {
        int ans =ProductDigits(1234);
        System.out.println(ans);
    }

    static int ProductDigits(int n){
        if(n%10 == n){
            return n;
        }
        return ProductDigits(n/10)*(n%10);
    }
}

