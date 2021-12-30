package com.randrita.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(4321));
    }

    static int reverse(int n){
        if(n%10==n){
            return n;
        }
        return ((n%10)* (int)(Math.pow(10,(n%10)-1)))+reverse(n/10);
    }
}
