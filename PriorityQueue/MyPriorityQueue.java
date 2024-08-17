package PriorityQueue;

import java.util.*;

public class MyPriorityQueue {

	
	ArrayList<Integer> arr;
	
	MyPriorityQueue(){
		arr= new ArrayList();
	}
	//Mapping
	private int leftChildIndex(int pi) {
		
		return 2*pi +1;
	}
	private int rightChildIndex(int pi) {
		
		return 2*pi+ 2;
	}
	
	private int parentIndex(int ci) {
		
		return (ci-1)/2;
	}
	
	
	// ADD
	public void add(int val) {
		arr.add(val);
		upheapify(arr.size()-1);
	}
	
	public void swap(int i, int j) {
		
		int temp= arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}
	
	private void upheapify(int ci) {
		
		if(ci==0)
		{
			return;
		}
		int parentIndex=parentIndex(ci);
		if(arr.get(parentIndex) > arr.get(ci)) {
		    	swap(parentIndex, ci);
		    	 upheapify(parentIndex);
		}
	}
	
	public void remove() {
		
		swap(0, arr.size()-1);
		arr.remove(arr.size()-1);
		
       downHeapify(0);
	}
	
	private void downHeapify(int pi) {
		
		int minIndex=pi;
		
		int leftChildIndex= leftChildIndex(pi);
		int rightChildIndex= rightChildIndex(pi);
		
		if(leftChildIndex >= arr.size() && rightChildIndex>=arr.size()) {
			return;
		}
		
		if(leftChildIndex< arr.size() 
				&& arr.get(minIndex) > arr.get(leftChildIndex)) {
			minIndex=leftChildIndex;
		}
		
		if(rightChildIndex < arr.size() 
				&& arr.get(minIndex) > arr.get(rightChildIndex)) {
			minIndex=rightChildIndex;
		}
		
		if(pi !=minIndex) {
			swap(pi, minIndex);
			downHeapify(minIndex);
		}
		
	}
	
	public int peek() {
		
		if(arr.size()==0) {
			return -1;
		}
		
		return arr.get(0);
	}
	
	
}
