package PriorityQueue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MyPriorityQueue pq= new MyPriorityQueue();
		
		pq.add(34);
		pq.add(12);
		pq.add(45);
		
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());
	}

}
