package com.techpalle;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add node at end
    public void add(int data) {
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

    // Recursive method to print in reverse
    public void printReverse(Node node) {
        if (node == null) {
            return;
        }
        printReverse(node.next); // Go till last node
        System.out.print(node.data + " "); // Print while coming back
    }
}
public class LinkedListReverseOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List in Reverse:");
        list.printReverse(list.head);

	}

}
