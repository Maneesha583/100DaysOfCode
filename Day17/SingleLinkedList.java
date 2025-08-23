package com.week3;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class SinglyLinkedList {
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete by value
    public void delete(int key) {
        if (head == null) return;

        if (head.data == key) { // if head needs to be deleted
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}


public class SingleLinkedList {

	public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // 10 -> 20 -> 30 -> NULL

        list.insertAtBeginning(5);
        list.display(); // 5 -> 10 -> 20 -> 30 -> NULL

        list.delete(20);
        list.display(); // 5 -> 10 -> 30 -> NULL
    }
}
	
