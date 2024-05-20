package Recursion_2;

public class SearchInArray {
  
	public static boolean Search(int [] arr, int target, int i) {
		
		  if(i==arr.length) {		  
			  return false;
		  }
		
		   if(arr[i]==target) {
			   return true;
		   }
		   
//		  boolean chhota_ans= Search(arr, target , i+1);  
//		  boolean mera_ans=chhota_ans;
//		  return mera_ans;
		  
		  return Search(arr, target , i+1); 
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,3,4,5,6,7,8,9,10};
     int target=51;
     
     System.out.println(Search(arr, target, 0));
	}

}
