package Array;

public class Case_study_3 {

	public static void swap(int [] arr, int i, int j) {
		
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3};
      
      System.out.println("Before Swap "+ arr[0]+", "+ arr[1]);
      
      swap(arr, 0,1);
      System.out.println("After Swap "+ arr[0]+", "+ arr[1]);
	}

}
