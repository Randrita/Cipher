package com.randrita.LList;

public class LList {

    private Node head;
    private Node tail;

    int size;
    LList(){
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
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public void addEnd(int val){
        if(tail==null){
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void addIndex(int data,int index){
        if(index==0){
            addFirst(data);
        }

        if(index==size){
            addEnd(data);
        }

        Node temp=head;
        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }

        Node node = new Node(data,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteEnd(){
        int val= tail.data;
        Node secondLast = get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;

        return val;
    }

    public Node get(int index){
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index==size-1){
           return deleteEnd();
        }

        Node element = get(index-1);
        int value = element.next.data;
        element.next=element.next.next;
        size--;

        return value;
    }

    public Node Find(int value){
        Node node = head;
        while(node!=null){
            if(node.data==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
}
