package Array_question;

public class Reverse_in_the_array {

	public static int [] reverse(int [] arr) {
		
		int [] reverse_arr=new int [arr.length];
		int index=0;
		
		for(int i= arr.length-1; i>=0;i--) {
			
			reverse_arr[index]=arr[i];
			index++;
		}
		
		return reverse_arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5,6,7};
      
      int [] reverse_arr= reverse(arr);
      
      for(int i=0; i<reverse_arr.length;i++) {
    	  
    	  System.out.print(reverse_arr[i]+" ");
      }
      
      
      
	}

}
