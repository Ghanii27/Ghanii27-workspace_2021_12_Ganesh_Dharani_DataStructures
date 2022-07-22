package edu.neu.csye6200;

public class StackUsage1 {

	int top;
	int size;
    int capacity;
    int[] arr;
    public StackUsage1(int size) {
    	arr=new int[size];
    	capacity=size;
    	top=-1;
    }
    public int size() {
    	return top+1;
    }
    public boolean isEmpty() {
    	return top==-1;
    }
    public boolean isFull() {
    	return(top==capacity-1);
    }
    public void push(int item) {
    	if(isFull()) {
    		System.exit(1);
    	}
    	System.out.println("Inserting the element : "+item);
    	arr[++top]=item;
    }
    public int pop() {
    	if(isEmpty()) {
    		System.exit(1);
    	}
    	System.out.println("Removing the element : "+peek());
    	return arr[top--];
    }
    public int peek() {
    	if(!isEmpty()) {
    		return arr[top];
    	}
    	else {
    		System.exit(1);
    	}
    	return -1;
    }
    public static void demo() {
    	StackUsage1 s=new StackUsage1(5);
    	System.out.println("*************** Stack implementation with fixed length Stack data structure for int data types *****************");   	
    	s.push(10);
    	s.push(20);
    	s.push(30);
    	s.pop();
    	s.push(40);
    	System.out.println("Top element is : "+s.peek());
    	System.out.println("Stack size : "+s.size());
    	s.pop();
    	if(s.isEmpty())
        System.out.println("Stack is Empty");
   else
      System.out.println("Stack is not Empty");
    }
}
