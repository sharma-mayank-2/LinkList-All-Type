package com.app;

/**
 * Created by s.mayank on 21/10/16.
 */
public class CircularLinkList {
    int size;
    Node3 head;
    Node3 tail;
    CircularLinkList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addAtBegin(int data){
        Node3 n = new Node3(data);
        if(size == 0){
            head = n;
            tail = n;
        } else{
            n.next = head;
            tail.next = n;
            head = n;
        }
        size++;
    }

    public void deleteAtBegin(){
        head = head.next;
        tail.next = head;
        size--;
    }

    public void addAtEnd(int data){
        Node3 n = new Node3(data);
        if(size == 0){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            n.next = head;
            tail = n;
        }
        size++;
    }

    public void deleteAtEnd(){
        Node3 currentNode = head;
        while(currentNode.next.next != head){
            currentNode = currentNode.next;
        }
        currentNode.next = head;
        size--;
    }

    public void display(){
        Node3 currentNode = head;
        System.out.print(currentNode.data+" -> ");
        currentNode = currentNode.next;
        while (currentNode != head){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void search(int data){
        Node3 currentNode = head;
        int a = 0;
        while(currentNode.next != head){
            a++;
            if(currentNode.data == data){
                System.out.println(data+" is present at index "+a);
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void getElementAtIndex(int index){
        Node3 currentNode = head;
        int a = 0;
        while(currentNode.next != head) {
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
        Node3 currentNode = head;
        int a = 0;
        while(currentNode.next != head) {
            a++;
            if(a == index){
                Node3 n = new Node3(data);
                Node3 next = currentNode.next;
                currentNode.next = n;
                n.next = next;
                size++;
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}
