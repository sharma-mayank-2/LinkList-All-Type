package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * Class to implement DoubleLinkList using Array.
 */
public class DoubleLinkList {
    int size;
    Node2 head;
    Node2 tail;
    DoubleLinkList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addAtBegin(int data){
        Node2 n = new Node2(data);
        if(size == 0){
            head = n;
            tail = n;
        }else{
            n.next = head;
            head.previous = n;
            head = n;
        }
        size++;
    }

    public void deleteAtBegin(){
        head = head.next;
        size--;
    }

    public void addAtEnd(int data){
        Node2 n = new Node2(data);
        if(size == 0){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            n.previous = tail;
            tail = n;
        }
        size++;
    }

    public void deleteAtEnd(){
        tail = tail.previous;
        tail.next = null;
        size--;
    }

    public void display(){
        Node2 currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void search(int data){
        Node2 currentNode = head;
        int a = 0;
        while(currentNode != null){
            a++;
            if(currentNode.data == data){
                System.out.println(data+" is present at index "+a);
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void getElementAtIndex(int index){
        Node2 currentNode = head;
        int a = 0;
        while(currentNode != null) {
            a++;
            if(a == index){
                System.out.println("at index "+a+" element present is "+currentNode.data);
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void getSize(){
        System.out.println("size is "+size);
    }

    public void addElementAfterIndex(int data, int index){
        Node2 currentNode = head;
        int a = 0;
        while(currentNode != null) {
            a++;
            if(a == index){
                Node2 n = new Node2(data);
                Node2 next = currentNode.next;
                currentNode.next = n;
                n.previous = currentNode;
                n.next = next;
                next.previous = n;
                size++;
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}

class Node2{
    int data;
    Node2 next;
    Node2 previous;
    Node2(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
