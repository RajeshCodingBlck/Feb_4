package Sorting_algo;

public class InsertionSort {

	public static void Insert(int[] arr, int i, int temp) {

		while (i >= 0 && arr[i] > temp) {
			arr[i + 1] = arr[i];
			i--;
		}

		arr[i + 1] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 10, 5, 3, 2, 1 };

		for (int j = 1; j < arr.length; j++) {
            
			Insert(arr,j-1,arr[j]);
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
