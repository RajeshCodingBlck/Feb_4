package Array_question;

public class Minimum_subarray_sum {
   
	public static int MinimumSum(int [] arr) {
		
		int overall_min_sum= Integer.MAX_VALUE;
		int currsum=0;
		
		for(int i=0; i<arr.length;i++) {
			
			currsum+=arr[i];
			overall_min_sum= Math.min(overall_min_sum, currsum);
			
			if(currsum>0) {
				currsum=0;
			}
		}
		
		return overall_min_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {-1,2,-3,-2,4,-5};
     
     System.out.println(MinimumSum(arr));
     
     
	}

}
