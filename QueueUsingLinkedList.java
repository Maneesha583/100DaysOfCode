package com.week3;


//Node class
class Node {
 int data;
 Node next;

 Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//Queue class using Linked List
class Queue {
 private Node front, rear;

 // Enqueue (insert element at rear)
 public void enqueue(int data) {
     Node newNode = new Node(data);
     if (rear == null) {
         front = rear = newNode;
         System.out.println(data + " enqueued");
         return;
     }
     rear.next = newNode;
     rear = newNode;
     System.out.println(data + " enqueued");
 }

 // Dequeue (remove element from front)
 public int dequeue() {
     if (front == null) {
         System.out.println("Queue is empty");
         return -1;
     }
     int val = front.data;
     front = front.next;

     if (front == null) {  // if queue becomes empty
         rear = null;
     }
     return val;
 }

 // Peek front element
 public int peek() {
     if (front == null) {
         System.out.println("Queue is empty");
         return -1;
     }
     return front.data;
 }

 // Check if queue is empty
 public boolean isEmpty() {
     return front == null;
 }
}

//Main class
public class QueueUsingLinkedList {
 public static void main(String[] args) {
     Queue q = new Queue();

     q.enqueue(10);
     q.enqueue(20);
     q.enqueue(30);

     System.out.println("Front element is " + q.peek());

     System.out.println(q.dequeue() + " dequeued");
     System.out.println(q.dequeue() + " dequeued");

     System.out.println("Is queue empty? " + q.isEmpty());
 }
}

