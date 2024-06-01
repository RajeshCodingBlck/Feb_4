package Recursion_4;

import java.util.ArrayList;

public class SubsetSum {

	public static void print2(int[] arr, int i, ArrayList<Integer> ans, int k, int sum) {
		if (i == arr.length) {
			
			if (sum == k) {
				System.out.println(ans);
			}
			return;
		}
		
		if(sum>k) {
			return;
		}
		// Include ith value
		ans.add(arr[i]);
		print2(arr, i + 1, ans, k, sum + arr[i]);
		ans.remove(ans.size() - 1);
		// Not Include
		print2(arr, i + 1, ans, k, sum);

	}

	public static void print(int[] arr, int i, ArrayList<Integer> ans, int k) {

		if (i == arr.length) {

			int currsum = 0;
			for (Integer val : ans) {
				currsum += val;
			}
			if (currsum != k) {
				return;
			}
			System.out.println(ans);
			return;
		}
		// Include ith value
		ans.add(arr[i]);
		print(arr, i + 1, ans, k);
		ans.remove(ans.size() - 1);
		// Not Include
		print(arr, i + 1, ans, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int k = 5;
		ArrayList<Integer> ans = new ArrayList();

		print2(arr, 0, ans, k,0);
	}

}
