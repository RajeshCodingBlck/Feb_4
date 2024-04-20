package TwoD_array;

public class Row_wise_ZigZag_Order {

	public static void ZigZag(int [][] arr) {
		
		int row= arr.length;
		int col= arr[0].length;
		for(int i=0; i<row;i++) {
			
			if(i%2==0) {
				
			for(int j=0; j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
				
			}else {
				for(int j=col-1; j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
				
				System.out.println();
			}	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] arr= {
    		  {1,2,3,4},
    		  {5,6,7,9},
    		  {10,11,12,13},
    		  {14,15,16,17}
      };
      
      ZigZag(arr);
      
      
	}

}
