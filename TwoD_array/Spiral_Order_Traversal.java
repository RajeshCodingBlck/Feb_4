package TwoD_array;

public class Spiral_Order_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, 
};
		
		int minr=0;
		int maxr=arr.length-1;
		
		int minc=0;
		int maxc=arr[0].length-1;
		
		int total= arr.length *arr[0].length;
		int count=0;
		
		while(count<total) {
			
			for(int i=minc; i<=maxc && count<total;i++) {
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			
			for(int i=minr; i<=maxr && count<total;i++) {
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			
			maxc--;
			for(int i=maxc; i>=minc && count<total;i--) {
				System.out.print(arr[maxr][i]+" ");
				count++;
			}
			maxr--;
			
			for(int i=maxr; i>=minr && count<total; i--) {
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			minc++;
		}
		
		
		
		
	}

}
