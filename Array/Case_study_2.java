package Array;

public class Case_study_2 {

	public static void swap(int [] arr,int [] brr) {
		
		int [] temp= arr;
		arr=brr;
		brr=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3};
      int [] brr= {10,20,30};
      
      System.out.println("Before Swap "+ arr[0]+ ", "+brr[0]);
      swap(arr, brr);
      System.out.println("After Swap "+ arr[0]+ ", "+brr[0]);
      
	}

}
