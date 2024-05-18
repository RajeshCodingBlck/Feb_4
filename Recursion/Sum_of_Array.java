package Recursion;

public class Sum_of_Array {

	public static int SumofArray(int [] arr, int i) {
		
		if(i==arr.length) {
			return 0;
		}
		
		int chhota_ans=SumofArray(arr, i+1);
		int mera_ans= chhota_ans+arr[i];
		return mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,10,12,15};
       
       System.out.println(SumofArray(arr,0));
       
	}

}
