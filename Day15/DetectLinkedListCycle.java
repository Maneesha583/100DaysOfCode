package com.week3;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DetectLinkedListCycle {

	public static void main(String[] args) {
		// Create a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next; // cycle (3 → 2)

        // Two pointer technique
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {        // pointers meet → cycle exists
                hasCycle = true;
                break;
            }
        }

        if (hasCycle)
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle");

	}

}
