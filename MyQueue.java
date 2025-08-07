package com.techpalle;

class Test{
	int[] queue;
	int front;
	int rear;
	int capacity;
	public Test(int capacity) {
		queue=new int[capacity];
		this.capacity=capacity;
		front=0;
		rear=0;
	}
	public void enqueue(int element) {
		if(isFull()==true) {
			System.out.println("queue is full,Try later");
			return;
		}
		queue[rear++]=element;
		System.out.println("successfully Inserted :"+element);
	}
	public int dequeue() {
		if(isEmpty()==true) {
			System.out.println("queue is empty,Try later");
			return -1;
			
		}
		int element=this.queue[front];
		front=front+1;
		System.out.println("removed successfully :"+element);
		return element;
	}
	public int size() {
		return rear-front;
		
	}
	public boolean isFull() {
		if(rear==capacity) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}
		else {
			return false;
		}
	}
	public int peek() {
		if(isEmpty()==true) {
			System.out.println("queue is empty");
			return -1;
		}
		int element =this.queue[front];
		return element;
	}
}

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Test t=new Test(10);
           t.enqueue(10);
           t.enqueue(20);
           t.enqueue(30);
           t.dequeue();
               
           }

}
