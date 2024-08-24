package DynamicProgramming;

public class AlternativeParitySubarray {

	public static int helper(int [] arr) {
		
		int n=arr.length;
		int [] dp= new int[n];
		
		dp[0]=1;
		int overAllAns=1;
		for(int i=1; i<n;i++) {	
			if(arr[i-1] %2 != arr[i]%2) {
//				dp[i]= Math.max(1,1+ dp[i-1]);
				dp[i]= 1+dp[i-1];
			}else {
				dp[i]=1;
			}	
			overAllAns= Math.max(overAllAns, dp[i]);
		}
		return overAllAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
