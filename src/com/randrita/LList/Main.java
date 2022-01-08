package com.randrita.LList;

public class Main {
    public static void main(String[] args) {
        LList list = new LList();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.display();

        //after adding addEnd Method
        list.addEnd(100);
        list.display();

        //after adding addIndex Method
        list.addIndex(10,3);
        list.display();

        list.deleteEnd();
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteIndex(0);
        list.display();

        System.out.println(list.Find(7));
    }
}
