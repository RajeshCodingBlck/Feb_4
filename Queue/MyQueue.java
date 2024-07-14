package Queue;

public class MyQueue {

	private int [] arr;
	private int front;
	private int rear;
	
	MyQueue(int size){
		arr= new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty() {
		
		if(front==-1 && rear==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		
		// for Linear 
//		if(rear== arr.length-1) {
//			return true;
//		}else {
//			return false;
//		}
		
		if((rear+1 )%arr.length==front) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getFront() throws Exception{
		
		if(isEmpty()) {
			throw  new Exception("Kyu Dekh raha he");
		}
		return arr[front];
	}
	
	public void Enqueue(int val) throws Exception {
		
		if(isFull()) {
			
		  throw new Exception("Queue is Overflow");
		}else if(isEmpty()) {
//			front=front+1;
//			rear= rear+1;
			front= (front+1)%arr.length;
			rear= (rear+1)%arr.length;
			arr[rear]=val;
		}else {
			//rear= rear+1;
			rear= (rear+1)%arr.length;
			arr[rear]=val;
		}
	}
	
	public void Dequeue() throws Exception {
		
		if(isEmpty()) {
		 throw new Exception("Queue is underflow");
		}else if(front==rear) {
			front=-1;
			rear=-1;
		}else {
//			front=front+1;
			front= (front+1)%arr.length;
		}
		
	}
	
	
	
	
}
