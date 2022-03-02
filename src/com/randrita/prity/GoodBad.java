package com.randrita.prity;
import java.util.Scanner;

public class GoodBad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //create the array
        int[] arr = new int[n];

        //taking array input
        for(int i =0;i<n;i++){
            arr[i]= input.nextInt();
        }

        //taking a variable input
        boolean flag=true;
        int zeroCount=0;
        int oneCount=0;
        for(int x:arr){

            if(x%2==0){
                zeroCount+=1;
            }

            else{
                oneCount+=1;
            }
        }

        if(zeroCount==n || oneCount==n){
            System.out.println("GOOD");
        }

        else {
            System.out.println("BAD");
        }
    }
}
