package com.randrita.stack;

import java.util.Stack;

public class DeleteMid {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        deleteMiddle(s, s.size());

    }

        public static void deleteMiddle(Stack<Integer> inputStack, int N) {
            // WRITE YOUR CODE HERE
            int n= inputStack.size();
            int count=0;
            System.out.println(solve(inputStack,n,count));
        }

        static Stack<Integer>  solve(Stack<Integer> inputStack, int n, int count){
            //base case
            if(count==n/2){
                inputStack.pop();
                return inputStack;
            }

            int num=inputStack.peek();
            inputStack.pop();

            //recursive call
            solve(inputStack,n,count+1);
            inputStack.push(num);

            return inputStack;
        }

    }

