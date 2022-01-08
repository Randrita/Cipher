package com.randrita.LinkList;

public class LinkList {

    private Node head;
    private Node tail;
    int size;

    LinkList(){
        this.size=0;
    }
    class Node{
        private int data;
        Node next;

        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    public void addFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
}
