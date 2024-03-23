package Array_question;

public class Min_element {

	public static int Minfinder(int [] arr) {
		
		
		int min_element=arr[0];
		
		for(int i=1; i<arr.length;i++) {	
//			if(min_element> arr[i]) {
//				min_element=arr[i];
//			}
			
			min_element= Math.min(min_element, arr[i]);
			
		}
		return min_element;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {10,2,1,4,10,3,10};
     
     int min_element= Minfinder(arr);
     
     System.out.println(min_element);
     
     
	}

}
