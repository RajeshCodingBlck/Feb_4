package Array_question;

public class Sum_of_Array {

	public static  int  sum(int [] arr) {
		
		int sum=0;
		
		for(int i=0; i<arr.length;i++) {
			sum+= arr[i];
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {10,20,30,10};
      
      System.out.println(sum(arr));
	}

}
