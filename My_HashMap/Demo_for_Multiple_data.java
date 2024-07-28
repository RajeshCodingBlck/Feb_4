package My_HashMap;

import java.util.LinkedList;

class Point{
	 
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class Demo_for_Multiple_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		Point [] arr= new Point[5];
//		
//		for(int i=0;i<5;i++) {
//			arr[i]=new Point(i,i);
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println(arr[0].x);
//		System.out.println(arr[0].y);
		
		
		LinkedList<Point> [] arr= new LinkedList[5];
		
		for(int i=0; i<5;i++) {
			
			arr[i]= new LinkedList();
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
	}

}
