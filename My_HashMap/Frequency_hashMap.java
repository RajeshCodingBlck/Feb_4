package My_HashMap;

import java.util.HashMap;

public class Frequency_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {1,6,3,4,2,1,6,3,4,1,1};
		 printallFre(arr);
	}

	public static void printallFre(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm= new HashMap();
		
		for(int i=0; i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				
				int old_fre= hm.get(arr[i]);
				hm.put(arr[i], old_fre+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		
		//System.out.println(hm);
		// for Each loop
		
		for( Integer  key: hm.keySet()) {
			System.out.println(key+ "-> "+ hm.get(key));
		}
		
		
	}

}
