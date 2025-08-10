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

public class DeleteNodeAtNthPosition {
	
	Node head;

    // Insert at end for creating list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete nth node
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If deleting head node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        // Move to (position - 1)th node
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // If position is invalid
        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }

        // Remove link to nth node
        temp.next = temp.next.next;
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
		DeleteNodeAtNthPosition list = new DeleteNodeAtNthPosition();

        // Create example list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();

        // Take user input
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        list.deleteAtPosition(pos);

        // Display after deletion
        System.out.println("After deletion:");
        list.display();

	}

}
