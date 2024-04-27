package Search_algo;

public class Linear_Ssearch {
   
	public static int Linear_Search(int [] arr, int target_val) {
		
		for(int i=0; i<arr.length;i++) {
			
			 if(arr[i]==target_val) {
				 return i;
			 }
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {10,1,3,15,2,11};
     int target_value=5;
     int index= Linear_Search(arr,  target_value);
     System.out.println(index);
     
     
	}

}
