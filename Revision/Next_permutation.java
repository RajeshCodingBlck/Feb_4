import java.util.*;
public class Next_permutation {
	public static void reverse(int [] arr, int i, int j){

		while(i<j){

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}

	}
	public static void nextPemrutation(int [] arr){
     
	 int index1=-1; 
	 for(int i=arr.length-1; i>0;i--){
		 if(arr[i-1]< arr[i]){
			 index1=i-1;
			 break;
		 }
	 }

	 if(index1==-1){
		 Arrays.sort(arr);
		 return;
	 }
	 int index2=-1;
	  
      for(int i=arr.length-1;i>index1;i--){

		  if(arr[i]>arr[index1]){
			  index2=i;
			  break;
		  }

	  }
	 //System.out.println(index1+ " "+index2);
	  //Swap
	  int temp=arr[index1];
	  arr[index1]=arr[index2];
	  arr[index2]=temp;
     
	  // reverse
	  reverse(arr, index1+1, arr.length-1);
     
	}
    public static void main(String args[]) {
      Scanner s= new Scanner(System.in);

	  int t= s.nextInt();
	  while(t>0){
         int n= s.nextInt();
		 int [] arr= new int[n];

		 for(int i=0; i<n;i++){
			 arr[i]=s.nextInt();
		 }
		 nextPemrutation(arr);
		 for(int i=0;i<n;i++){
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		  t--;
	  }
    }
}