package com.week3;

//Definition for singly-linked list node
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}

public class Merge2SortedLinkedList {

	    // Function to merge two sorted linked lists
	    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(-1); // dummy node
	        ListNode tail = dummy; // pointer to build merged list

	        while (l1 != null && l2 != null) {
	            if (l1.val <= l2.val) {
	                tail.next = l1;
	                l1 = l1.next;
	            } else {
	                tail.next = l2;
	                l2 = l2.next;
	            }
	            tail = tail.next; // move tail
	        }

	        // attach the remaining nodes
	        tail.next = (l1 != null) ? l1 : l2;

	        return dummy.next; // head of merged list
	    }

	    // Helper function to print the linked list
	    public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // First sorted list: 1 -> 3 -> 5
	        ListNode l1 = new ListNode(1);
	        l1.next = new ListNode(3);
	        l1.next.next = new ListNode(5);

	        // Second sorted list: 2 -> 4 -> 6
	        ListNode l2 = new ListNode(2);
	        l2.next = new ListNode(4);
	        l2.next.next = new ListNode(6);

	        // Merge both lists
	        ListNode merged = mergeTwoLists(l1, l2);

	        // Print result
	        System.out.print("Merged List: ");
	        printList(merged);
	    }
	}
