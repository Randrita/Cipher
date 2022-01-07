package com.randrita.LL;

public class LL {

    private Node head,tail;
    private int size;
    LL(){
        this.size=0;
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;

        if(tail== null){
            tail=head;
        }

        size+=1;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    //node creation
    class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
        }

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
