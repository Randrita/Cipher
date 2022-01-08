package com.randrita.LinkList;


public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();

        list.addFirst(4);
        list.display();
    }
}
