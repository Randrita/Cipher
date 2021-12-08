package com.randrita;

class A{
    public void intval(){
        System.out.println("I print int value");
    }
}

class B extends A{
    public void stringval(){
        System.out.println("I print String value");
    }
}

public class Main{
    public static void main(String [] args){
        A a = new B();
        a.intval();
        //a.stringval();
        B b = new B();
        b.stringval();
        b.intval();
    }
}