import java.util.*;
public class CircularSum {
	public static int KadensMax(int [] arr){
		int overall_max=Integer.MIN_VALUE;
		int currsum=0;
		for(int i=0; i<arr.length;i++){
			currsum+=arr[i];
			overall_max= Math.max(overall_max, currsum);

			if(currsum<0){
				currsum=0;
			}
		}
		return overall_max;
	}
	public static int KadensMin(int [] arr){
		int overall_min=Integer.MAX_VALUE;
		int currsum=0;
		for(int i=0; i<arr.length;i++){
			currsum+=arr[i];
			overall_min= Math.min(overall_min, currsum);

			if(currsum>0){
				currsum=0;
			}
		}
		return overall_min;
	}
    public static void main(String args[]) {
    
	  Scanner s= new Scanner(System.in);
	  int t= s.nextInt();

	  while(t>0){
		  int n= s.nextInt();
		  int [] arr= new int[n];
		  int totalsum=0;
         for(int i=0; i<n;i++){
			 arr[i]=s.nextInt();
			 totalsum+=arr[i];
		 }
		 int linear_ans= KadensMax(arr);
		 int circular_ans= totalsum- KadensMin(arr);
         System.out.println(Math.max(linear_ans, circular_ans));
		  t--;
	  }
    }
}