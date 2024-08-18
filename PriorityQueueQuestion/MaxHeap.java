package PriorityQueueQuestion;

import java.util.*;

class cmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		
		  if(o1> o2) {
			  return -1;
		  }else {
			  return 1;
		  }
	}
}
public class MaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		PriorityQueue<Integer> pq= new PriorityQueue(new cmp());
		
		pq.add(20);
		pq.add(100);
		pq.add(120);
		
		System.out.println(pq.peek());
		
		
	}

}
