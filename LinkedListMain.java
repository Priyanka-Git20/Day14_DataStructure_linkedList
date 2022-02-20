package com.bridgelabz.linkedList;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the data structure program(linkedList)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press '1' to add the data at the start");
        System.out.println("Press '2' to add the data at the end");
        System.out.println("Press '3' to insert data inBetween");
        System.out.println("Press '4' to delete data of first node");
        System.out.println("Press '5' to delete data of last node");
        System.out.println("Press '6' to find index of 30 in linked list");
        System.out.println("Press '7' to Add data after the data");
        System.out.println("Press '8' to delete data after searching required data");
        switch (scanner.nextInt()) {
            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
            case 5:
                Operations.deleteLastNode();
                break;
            case 6:
                Operations.findNodeBasedOnValue();
            case 7:
                Operations.insertAfterSearchNode();
                break;
            case 8:
                Operations.deleteAfterNodeAfterSearchNode();
        }
    }
}
