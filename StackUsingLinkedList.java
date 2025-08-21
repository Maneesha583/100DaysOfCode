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

//Stack class using Linked List
class Stack {
 private Node top;  // top of stack

 // Push element onto stack
 public void push(int data) {
     Node newNode = new Node(data);
     newNode.next = top;
     top = newNode;
     System.out.println(data + " pushed to stack");
 }

 // Pop element from stack
 public int pop() {
     if (top == null) {
         System.out.println("Stack is empty");
         return -1;
     }
     int popped = top.data;
     top = top.next;
     return popped;
 }

 // Peek top element
 public int peek() {
     if (top == null) {
         System.out.println("Stack is empty");
         return -1;
     }
     return top.data;
 }

 // Check if stack is empty
 public boolean isEmpty() {
     return top == null;
 }
}

//Main class
public class StackUsingLinkedList {
 public static void main(String[] args) {
     Stack stack = new Stack();

     stack.push(10);
     stack.push(20);
     stack.push(30);

     System.out.println("Top element is " + stack.peek());

     System.out.println(stack.pop() + " popped from stack");
     System.out.println(stack.pop() + " popped from stack");

     System.out.println("Is stack empty? " + stack.isEmpty());
 }
}

