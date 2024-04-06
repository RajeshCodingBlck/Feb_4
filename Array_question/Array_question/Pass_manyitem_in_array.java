package Array_question;

public class Pass_manyitem_in_array {

	public static int [] Get_Sum_Max_Min(int [] arr) {
		
		int sum=0;
		int max= arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			
			sum+=arr[i];
			max= Math.max(max, arr[i]);
			min= Math.min(min, arr[i]);
		}
		int [] ans= new int [3];
		ans[0]=sum;
		ans[1]=max;
		ans[2]=min;
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {10,2,1,10,4};	
		int [] ans=Get_Sum_Max_Min(arr);	
		for(int i=0; i<ans.length;i++) {
			
			System.out.println(ans[i]);
			
		}
		
		
	}

}
