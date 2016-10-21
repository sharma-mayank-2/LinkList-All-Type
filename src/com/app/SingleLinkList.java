package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * Class to implement SingleLinkList using Array.
 * There are total 9 methods.
 */
public class SingleLinkList {
    int size;
    Node1 head;
    SingleLinkList(){
        this.size = 0;
        this.head = null;
    }

    public void addAtBegin(int data){
        Node1 n = new Node1(data);
        n.next = head;
        head = n;
        size++;
    }

    public void deleteAtBegin(){
        head = head.next;
        size--;
    }

    public void addAtEnd(int data){
        Node1 n = new Node1(data);
        Node1 currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = n;
        size++;
    }

    public void deleteAtEnd(){
        Node1 currentNode = head;
        while(currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        size--;
    }

    public void display(){
        Node1 currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void search(int data){
        Node1 currentNode = head;
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
        Node1 currentNode = head;
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
        Node1 currentNode = head;
        int a = 0;
        while(currentNode != null) {
            a++;
            if(a == index){
                Node1 n = new Node1(data);
                Node1 next = currentNode.next;
                currentNode.next = n;
                n.next = next;
                size++;
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
