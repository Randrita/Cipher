package com.randrita.Recursion;
import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        //numberCount(5);
        numberCountRev(n);
    }

    static void numberCount(int n){

        if(n<1){
            return;
        }
        System.out.println(n);
        numberCount(n-1);
    }

    static void numberCountRev(int n){


        if(n<=0){
            return;
        }
        numberCountRev(n-1);
        System.out.println(n);

    }
}
