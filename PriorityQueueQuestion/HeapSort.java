package PriorityQueueQuestion;

import java.util.PriorityQueue;

public class HeapSort {

	public static void Sort(int [] arr) {
		
		PriorityQueue<Integer> pq= new PriorityQueue();
		
		for(int i=0; i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		int index=0;
		while(pq.size()>0) {
			
			int rm= pq.remove();
			arr[index]=rm;
			index++;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {6,5,10,2,3,1};
		Sort(arr);
		for(int val  : arr) {
			System.out.print(val+" ");
		}
		
	}

}
