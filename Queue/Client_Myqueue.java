package Queue;

public class Client_Myqueue {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
    
		MyQueue q= new MyQueue(5);
		
		q.Enqueue(45);
		q.Enqueue(34);
		q.Enqueue(32);
		q.Enqueue(31);
		q.Enqueue(4);
		q.Dequeue();
		q.Enqueue(5777);
		System.out.println(q.getFront());
		q.Dequeue();
		System.out.println(q.getFront());
		
		int size= (int)1e10; // 10^9
//		int val= 10_0000;
//		int val2= 0b111;
//		System.out.println(val2);
		
		int [] arr= new int[size];
		
		
		
		
	}

}
