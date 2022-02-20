package com.bridgelabz.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the data structure program(linkedList)");
        MyNode firstNode = new MyNode(56);
        MyNode secondNode = new MyNode(30);
        MyNode thirdNode = new MyNode(70);

        MyNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        MyNode tail = thirdNode;
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.key + " " );
            temp = temp.next;
        }
    }
}
