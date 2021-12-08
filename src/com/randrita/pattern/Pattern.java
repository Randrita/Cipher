package com.randrita.pattern;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= input.nextInt();

        //calling method of different class
        Number obj = new Number();
        //obj.displayNumber(n);

        ReverseNumber obj1 = new ReverseNumber();
        //obj1.displayReverseNumber(6);

        CountNumber obj2 = new CountNumber();
        //obj2.displayCountNumber(n);

        TrianglePattern obj3 = new TrianglePattern();
        //obj3.displayTrianglePattern(5);

        RepeatNumber obj4 = new RepeatNumber();
        //obj4.displayRepeatNumber(5);

        RepeatCountNumber obj5 = new RepeatCountNumber();
        //obj5.displayRepeatCountNumber(5);

        RowPattern obj6 =new RowPattern();
        //obj6.displayRowPattern(7);

        pattern8 obj7=new pattern8();
        //obj7.displayPattern8(6);

        BoxNumberPattern obj8 = new BoxNumberPattern();
        obj8.displayBoxNumberPattern(n);

    }
}

class Number{
    public void displayNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+"   ");
            }
            System.out.println("");
        }
    }
}

class ReverseNumber{
    public void displayReverseNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((n-j)+1+" ");
            }
            System.out.println("");
        }
    }
}

class CountNumber{
    public void displayCountNumber(int n){
        int count=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                System.out.print(count+" ");
                count=count+1;
            }
            System.out.println("");
        }
    }
}

class TrianglePattern{
    public void displayTrianglePattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}

class RepeatNumber{
    public void displayRepeatNumber(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}

class RepeatCountNumber{
    public void displayRepeatCountNumber(int n){
        int count=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println("");
        }
    }
}

class RowPattern{
    public void displayRowPattern(int n){
        for(int i=1;i<n;i++){
            int temp=i;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp+=1;
            }
            System.out.println("");
        }
    }

}

class pattern8{
    public void displayPattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}

class BoxNumberPattern{
    public void displayBoxNumberPattern(int n){
        int loopCount = 2*n-2;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int value = n - (Math.min(Math.min(i,j),Math.min(loopCount-i,loopCount-j)));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}