package com.bridgelabz.linkedList;

public class Operations {
    public static LinkedList addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
    }

    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        MyNode secondNode = linkedList.push(70);
        MyNode firstNode = linkedList.push(56);
        MyNode newNode= new MyNode(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("after:");
        linkedList.print();
    }
    public static void deleteFirstNode() {
        LinkedList linkedList = addDataAtStart();
        System.out.println();
        linkedList.pop();
        linkedList.print();
    }
    public static void deleteLastNode() {
        LinkedList linkedList = addDataAtStart();
        System.out.println();
        linkedList.popLast();
        linkedList.print();
    }

    public static void findNodeBasedOnValue() {
        LinkedList linkedList = addDataAtStart();
        linkedList.searchNode(30);
    }

    public static void insertAfterSearchNode() {
        LinkedList linkedList = addDataAtStart();
        MyNode newNode = new MyNode(40);
        MyNode previousNode = linkedList.searchNodeAt(30, newNode);
        System.out.println("Before");
        linkedList.print();
    }
}
