package CustomSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class cmp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		int unit_o1= o1%10;
		int unit_o2= o2%10;
		
		if(unit_o1< unit_o2) {
			return -1;
		}else {
			return 1;
		}
	}	
}

class cmp1 implements Comparator<Integer>{

	@Override
	public int compare(Integer l, Integer r) {
		// TODO Auto-generated method stub
		
		if(l>r) {
			return -1;
		}else {
			return  1;
		}
		
	}
	
	
}


public class SortTheArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr= new ArrayList();
		
		arr.add(67);
		arr.add(93);
		arr.add(100);
		arr.add(74);
		arr.add(95);
		Scanner s= new Scanner(System.in);
		int val=s.nextInt();
		
//		if(val==1) {
//			Collections.sort(arr, new cmp());
//		}else {
//			Collections.sort(arr, new cmp1());
//		}
		Collections.sort(arr);
		System.out.println(arr);
		
		
	}

}
