package com.randrita.stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String message="Rimi";
        System.out.println(reverseString(message));
    }

    static String reverseString(String msg){
        char ch;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<msg.length();i++){
            ch=msg.charAt(i);
            stack.push(ch);

        }
        String result="";
        while(!stack.empty()){
            result+=stack.pop();
        }

        return result;
    }
}
