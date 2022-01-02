package com.randrita.stack;
import java.util.*;

public class StackArr {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the array size");
        n= input.nextInt();
        //int[] arr = new int[n];
        //System.out.println("Enter the array elements: ");

        MyStack stack = new MyStack(n);
        boolean flag =true;

        while(flag){
            System.out.println("Choose the Operation: \n1.PUSH\n2.PEAK\n3.POP\n4.DISPLAY\n5.EXIT");
            int expression = input.nextInt();
            switch (expression){
                case 1:
                    System.out.println("Enter the value you want to add");
                    int data = input.nextInt();
                    stack.push(data);
                    break;

                case 2:
                    System.out.println("Current Element: "+stack.peak());
                    break;

                case 3:
                    stack.pop();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Try Again!");
            }
        }
    }
}

class MyStack{
    int a[];
    int capacity;
    int top;

    MyStack(int n){
        this.capacity=n;
        this.a= new int[capacity];
        this.top=-1;
    }
    /*
    * In Stack we perform 3 major operation push,pop,peak
    * Apart from that we will deal with OVERFLOW & UNDERFLOW situations
    */

    void push(int data) throws Exception {
        if(top==capacity-1){
            throw new Exception("OVERFLOW");
        }
        top++;
        a[top]=data;
    }

    int peak() throws Exception {
        if(top==-1){
            throw new Exception("EMPTY STACK");
        }
        return a[top];
    }

    int pop() throws Exception{
        if(top==-1){
            throw new Exception("UNDERFLOW");
        }
        a[top]=0;
        return a[top--];
    }

    void display(){
        System.out.println("Current Stack: " + Arrays.toString(a));
    }

}
