package edu.neu.csye6200;




public class QueueUsage1 {
	
	int front, rear, size;
	int capacity;
	int arr[];
	int count;
	
	
	//Queue constructor
	public QueueUsage1(int size)
	{
		arr=new int[size];
		capacity=size;
		front=0;
		rear=-1;
		count=0;;
	}
public int size() {
	return count;
}
public boolean isEmpty() {
	return(size()==0);
}
public boolean isFull() {
	return(size()==capacity);
}
public void enqueue(int item) {
	if(isFull()) {
		System.exit(1);
	}
	System.out.println("Enqueing the element : "+item);
	rear=(rear+1)%capacity;
	arr[rear]=item;
	count++;
}
public int dequeue() {
	if(isEmpty()) {
		System.exit(1);
	}
	int e=arr[front];
	System.out.println("Removing the element : "+arr[front]);
	front=(front+1)%capacity;
	count--;
	return e;
}
public int peek() {
	if(isEmpty()) {
		System.exit(1);
	}
	return arr[front];
}
//Queue demo method
public static void demo(){
	QueueUsage1 q=new QueueUsage1(5);
	System.out.println("******** Queue implementation with fixed length Queue data structure for int data types *******");
	q.enqueue(1);
	q.enqueue(2);
	q.enqueue(3);
	System.out.println("Front element is : "+q.peek());
	q.dequeue();
	System.out.println("Front element is : "+q.peek());
	System.out.println("Queue size is : "+q.size());
	if(q.isEmpty())
		System.out.println("Queue is Empty");
	else
		System.out.println("Queue is Not Empty");
}

}
