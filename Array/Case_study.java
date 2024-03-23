package Array;

public class Case_study {

	public static void swap(int a, int b) {
		
		int temp=a;
		a=b;
		b=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  int [] arr= {1,2,3,4,5};
	  
	 // int [] brr= {10,20,30,40,50};
	  
	  System.out.println("Before Swap "+ arr[0]+" , "+ arr[1]);
	  swap(arr[0], arr[1]);
	  System.out.println("After Swap "+ arr[0]+" , "+ arr[1]);
	  
	}

}
