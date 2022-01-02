package com.randrita.stack;
import java.util.*;

public class StackCollection {
    public static void main(String[] args) {
        Stack <Integer> stk = new Stack<>();

        System.out.println("Applying PUSH operation:");
        stk.push(10);
        stk.push(20);
        stk.push(30);
        System.out.println("Current Stack: "+stk);

        System.out.println("Applying POP operation:");
        stk.pop();
        System.out.println("Current Stack: "+stk);

        System.out.println("Applying PEEK operation:");
        System.out.println("Current PEEK element: "+stk.peek());


        System.out.println("Applying ISEmpty operation:");
        System.out.println("Is my stack empty: "+stk.empty());

    }
}
