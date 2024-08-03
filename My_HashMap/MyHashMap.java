package My_HashMap;

import java.util.LinkedList;

public class MyHashMap {

	LinkedList<Entry>[] arr;

	MyHashMap() {
		arr = new LinkedList[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new LinkedList();
			// System.out.println(arr[i]);
		}
	}

	private int hashfunction(String key) {

		int hashValue = key.hashCode();
		int index = Math.abs(hashValue) % arr.length;
		return index;
	}

	public boolean containsKey(String key) {

		// find the Mapping Index of Given Key.
		int index = hashfunction(key);
		LinkedList<Entry> list = arr[index];
		for (Entry e : list) {

			if (e.key.equals(key)) {
				return true;
			}

		}
		return false;

	}

	public void put(String key, int value) {

		int index = hashfunction(key);
		LinkedList<Entry> list = arr[index];

		if (containsKey(key)) {
			for (Entry e : list) {
				if (e.key.equals(key)) {
					e.value = value;
				}
			}
		} else {

			Entry e = new Entry(key, value);
			list.addLast(e);
		}
	}

	public int get(String key) {

		int index = hashfunction(key);
		LinkedList<Entry> list = arr[index];
		for (Entry e : list) {

			if (e.key.equals(key)) {
				return e.value;
			}

		}
		return -1;
	}

	public void remove(String key) {

		int index = hashfunction(key);
		LinkedList<Entry> list = arr[index];
		for (Entry e : list) {

			if (e.key.equals(key)) {
				list.remove(e);
			}

		}
	}
    
	@Override
	public String toString() {
     
		
		 String ans= "[ ";
		 for(int i=0; i<arr.length;i++) {
			 LinkedList<Entry> list= arr[i];
			 for(  Entry e : list) { 
				 ans+=  "{ " + e.key + " = "+ e.value + " } ";
			 }
		 }
		 ans+=" ]";
		 return ans;
		 
	}
}
