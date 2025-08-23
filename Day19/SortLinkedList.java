package com.week3;

public class SortLinkedList {

	// Node class
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    // Insert new node at end
    public void insert(int data) {
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

    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main sort function
    public void sort() {
        head = mergeSort(head);
    }

    // Merge sort for linked list
    private Node mergeSort(Node h) {
        if (h == null || h.next == null) {
            return h; // Base case
        }

        // Split into two halves
        Node middle = getMiddle(h);
        Node nextHalf = middle.next;
        middle.next = null;

        // Recursively sort each half
        Node left = mergeSort(h);
        Node right = mergeSort(nextHalf);

        // Merge sorted halves
        return merge(left, right);
    }

    // Merge two sorted lists
    private Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    // Find middle node (slow-fast pointer)
    private Node getMiddle(Node h) {
        if (h == null) return h;
        Node slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Main method
    public static void main(String[] args) {
        SortLinkedList list = new SortLinkedList();

        // Insert elements
        list.insert(30);
        list.insert(10);
        list.insert(50);
        list.insert(20);
        list.insert(40);

        System.out.println("Unsorted List:");
        list.printList();

        // Sort the linked list
        list.sort();

        System.out.println("Sorted List:");
        list.printList();
    }
}
