package Array_question;

public class Reverse_the_array_in_range {
   
	public static void reverse_in_range(int [] arr, int s, int e) {
		
		int i=s;
		int j= e;

		while(i<=j) {
			
			//System.out.println("Swapping between "+ i +" "+j);
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,6,7,8,9,10};
       reverse_in_range(arr, 5,7);
       
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
       
       
	}

}
