package Recursion_2;

public class SortTheArray {
    
	public static void Sort(int [] arr , int i) {
		
		 if(i==arr.length) {
			 return ;
		 }
			
		   Sort(arr, i+1);	   
		for(int j=i; j<arr.length-1; j++) {
			
			if(arr[j]> arr[j+1]) {
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		   
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr=  {5,4,3,2,1};
       Sort(arr,0);
       
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
