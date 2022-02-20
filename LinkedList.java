package com.bridgelabz.linkedList;

public class LinkedList {
    MyNode head;
    MyNode tail;

    public void push(int key) {
        MyNode newNode = new MyNode(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            MyNode temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            MyNode temp = head;
            while (temp != null) {
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
        }
    }

    public void append(int key) {
        MyNode newNode = new MyNode(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }
}



