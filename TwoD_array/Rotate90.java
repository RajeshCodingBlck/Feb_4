package TwoD_array;

public class Rotate90 {
	public static void Transpose(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	public static void Reverse(int [][] arr) {
		for(int j=0; j<arr[0].length;j++) {
			// work
			int i1=0;
			int i2= arr.length-1;
			while(i1<i2) {	
				int temp=arr[i1][j];
				arr[i1][j]=arr[i2][j];
				arr[i2][j]=temp;
				
				i1++;
				i2--;
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, 
				        { 5, 6, 7, 8 }, 
				        { 9, 10, 11, 12 },
				        { 13, 14, 15, 16 }

		};
		Transpose(arr);
		Reverse(arr);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
