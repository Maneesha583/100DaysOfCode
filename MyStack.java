package com.techpalle;


class StackCheck{
	int[] stack;
	int top;
	int capacity;
	public StackCheck(int capacity) {
		stack=new int[capacity];
		top=-1;
		this.capacity=capacity;
	}
	//Algorithms
	//1.push elements to top of the stack
	public void push(int element) {
		if(top==capacity-1) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top]=element;
		System.out.println("element inserted..."+element);
	}
	
	//2.pop element from the stack
	public int pop() {
		if(isEmpty()==true) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int element = stack[top--];
		return element;
	}
	//peek
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top];
	}
	//isEmpty
	public boolean isEmpty() {
		return top==-1;
	}
	//Size
	public int size() {
		return top+1;
	}
	//display
	 public void display() {
	     for (int i = 0; i <= top; i++) {
	          System.out.print(stack[i] + " ");
	      }
	        System.out.println();
	  }
}


public class MyStack {

	public static void main(String[] args) {
		StackCheck s=new StackCheck(10);
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		System.out.println("element popped:");
		int element=s.pop();
		System.out.println(element);
		System.out.println("size:"+s.size());
		s.display();

	}

}
