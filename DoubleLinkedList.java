package com.week3;

//Node class
//Doubly Linked List class
class DoublyLinkedList {
 
 // Inner Node class
 class Node {
     int data;
     Node prev, next;

     Node(int data) {
         this.data = data;
         this.prev = null;
         this.next = null;
     }
 }

 Node head;  // head of the list

 // Insert at end
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
     newNode.prev = temp;
 }

 // Insert at beginning
 public void insertAtBeginning(int data) {
     Node newNode = new Node(data);

     if (head == null) {
         head = newNode;
         return;
     }

     newNode.next = head;
     head.prev = newNode;
     head = newNode;
 }

 // Delete a node by value
 public void delete(int key) {
     if (head == null) return;

     Node temp = head;

     // If head is to be deleted
     if (temp.data == key) {
         head = temp.next;
         if (head != null) head.prev = null;
         return;
     }

     // Search for the node to delete
     while (temp != null && temp.data != key) {
         temp = temp.next;
     }

     if (temp == null) return; // not found

     if (temp.next != null) temp.next.prev = temp.prev;
     if (temp.prev != null) temp.prev.next = temp.next;
 }

 // Display forward
 public void displayForward() {
     Node temp = head;
     System.out.print("Forward: ");
     while (temp != null) {
         System.out.print(temp.data + " <-> ");
         temp = temp.next;
     }
     System.out.println("NULL");
 }

 // Display backward
 public void displayBackward() {
     if (head == null) return;

     Node temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }

     System.out.print("Backward: ");
     while (temp != null) {
         System.out.print(temp.data + " <-> ");
         temp = temp.prev;
     }
     System.out.println("NULL");
 }
}

//Main class
public class DoubleLinkedList {
 public static void main(String[] args) {
     DoublyLinkedList list = new DoublyLinkedList();

     list.insert(10);
     list.insert(20);
     list.insert(30);
     list.displayForward();   // Forward: 10 <-> 20 <-> 30 <-> NULL
     list.displayBackward();  // Backward: 30 <-> 20 <-> 10 <-> NULL

     list.insertAtBeginning(5);
     list.displayForward();   // Forward: 5 <-> 10 <-> 20 <-> 30 <-> NULL

     list.delete(20);
     list.displayForward();   // Forward: 5 <-> 10 <-> 30 <-> NULL
     list.displayBackward();  // Backward: 30 <-> 10 <-> 5 <-> NULL
 }
}
