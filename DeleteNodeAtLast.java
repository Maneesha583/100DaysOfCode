package com.week2;

class Node {
    int data;
    Node next;
    Node(int data) { 
    	this.data = data; 
    	}
}

public class DeleteNodeAtLast {
	
	static Node deleteNthFromEnd(Node head, int n) {
	 	Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy, second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) first = first.next;

        // Move both pointers
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Delete nth from end
        second.next = second.next.next;
        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        print(head);
        head = deleteNthFromEnd(head, 2);
        print(head);

	}

}
