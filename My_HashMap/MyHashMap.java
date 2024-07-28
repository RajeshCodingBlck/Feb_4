package My_HashMap;

import java.util.LinkedList;

public class MyHashMap {
    
	LinkedList<Entry> [] arr;
	
	MyHashMap(){
		arr= new LinkedList[5];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]= new LinkedList();
			System.out.println(arr[i]);
		}
	}
	
	
}
