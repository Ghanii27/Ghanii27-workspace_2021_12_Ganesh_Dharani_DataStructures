package edu.neu.csye6200;

public class StackUsage2<T> {
	
	protected T[] arr;
	protected int top;
	protected int size;
   protected int capacity;
   
   //Stack construcutor
   @SuppressWarnings("unchecked")
public StackUsage2(int size) {
	   arr=(T[]) new Object[size];
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
   public void push(T item) {
   	if(isFull()) {
   		System.exit(1);
   	}
   	System.out.println("Inserting->"+item);
   	arr[++top]=item;
   }
   public T pop() {
   	if(isEmpty()) {
   		System.exit(1);
   	}
   	System.out.println("Removing->"+peek());
   	return arr[top--];
   }
   public T peek() {
   	if(isEmpty()) {
   		System.exit(1);  
   		}
   	return arr[top];
   }
   //Stack demo method
   public static void demo() {
	   StackUsage1 s=new StackUsage1(5);
   	System.out.println("*********** Stack implementation with fixed length Stack data structure for a Generic T data type *************");   	
   	s.push(10);
   	s.push(20);
   	s.push(30);
   	s.pop();
   	s.push(40);
   	System.out.println("Top element is : "+s.peek());
   	System.out.println("Stack size:"+s.size());
   	s.pop();
   	if(s.isEmpty())
       System.out.println("Stack is Empty");
  else
     System.out.println("Stack is not Empty");
   }
   

}
