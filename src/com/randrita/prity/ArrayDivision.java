package com.randrita.prity;
import java.util.Scanner;

public class ArrayDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a,b;

        if(n%2==0){
            a=b=n/2;
            while(true){
                if(a+2*b==n){
                    break;
                }
                else{
                    a-=1;
                    b-=1;
                }
            }
        }

        else{
            a=n/2+1;
            b=n/2;

            while(true){
                if(a+2*b==n){
                    break;
                }
                else{
                    a-=1;
                    b-=1;
                }
            }
        }

        System.out.println(a+" "+b);
    }
}
