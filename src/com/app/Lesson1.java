package com.app;

/**
 * Here is my main Class.
 */
public class Lesson1 {
    public static void main(String[] args){
        System.out.println("single link list Impl");
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.addAtBegin(30);
        singleLinkList.addAtBegin(20);
        singleLinkList.addAtBegin(10);
        singleLinkList.addAtEnd(40);
        singleLinkList.display();
        singleLinkList.deleteAtBegin();
        singleLinkList.deleteAtEnd();
        singleLinkList.display();
        singleLinkList.getSize();
        singleLinkList.getElementAtIndex(2);
        singleLinkList.addElementAfterIndex(25, 1);
        singleLinkList.display();
        singleLinkList.search(25);

        System.out.println("doubleLinkList Impl");
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.addAtBegin(30);
        doubleLinkList.addAtBegin(20);
        doubleLinkList.addAtBegin(10);
        doubleLinkList.addAtEnd(40);
        doubleLinkList.display();
        doubleLinkList.deleteAtBegin();
        doubleLinkList.deleteAtEnd();
        doubleLinkList.display();
        doubleLinkList.getSize();
        doubleLinkList.getElementAtIndex(2);
        doubleLinkList.addElementAfterIndex(25, 1);
        doubleLinkList.display();

        System.out.println("CircularLinkList Impl");
        CircularLinkList circularLinkList = new CircularLinkList();
        circularLinkList.addAtBegin(40);
        circularLinkList.addAtBegin(30);
        circularLinkList.addAtBegin(20);
        circularLinkList.addAtBegin(10);
        circularLinkList.addAtEnd(50);
        circularLinkList.display();
        circularLinkList.deleteAtBegin();
        circularLinkList.deleteAtEnd();
        circularLinkList.display();
        circularLinkList.getSize();
        circularLinkList.search(30);
        circularLinkList.getElementAtIndex(2);
        circularLinkList.addElementAfterIndex(25, 1);
        circularLinkList.display();
    }
}
