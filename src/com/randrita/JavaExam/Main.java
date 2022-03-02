package com.randrita.JavaExam;
import com.randrita.stack.StackException;

public class Main {

        public static void main(String[] args) throws StackException {
            Stack stack = new Stack(3);

            stack.push(34);
            stack.push(45);
            stack.push(2);
            stack.push(1);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }
    }

