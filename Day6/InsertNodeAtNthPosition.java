package com.techpalle;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertNodeAtNthPosition {
	
	Node head;

    // Insert at nth position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If inserting at head (position 1)
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        // Move to (position - 1)th node
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // If position is invalid
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }

        // Insert newNode
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		InsertNodeAtNthPosition list = new InsertNodeAtNthPosition();

        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.display();

        // Take user input
        System.out.print("Enter data to insert: ");
        int data = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        sc.close();

        list.insertAtPosition(data, pos);

        // Display after insertion
        System.out.println("After insertion:");
        list.display();

	}

}
