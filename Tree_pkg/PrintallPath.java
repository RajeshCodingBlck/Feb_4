package Tree_pkg;

import java.util.ArrayList;

public class PrintallPath {

	public static void helper(TreeNode root, ArrayList<Integer> ans) {
		
		if(root==null) { // -ve Base 
//			System.out.println(ans);
			return;
		}
		
		if(root.left==null && root.right==null) { // +ve Base Case
			ans.add(root.data);
			System.out.println(ans);
			ans.remove(ans.size()-1);
			return;
		}
		
		 ans.add(root.data);
		 helper(root.left, ans);
		 helper(root.right, ans);
		 ans.remove(ans.size()-1);
	}
	public static void Print(TreeNode root) {
		
		ArrayList<Integer> ans= new ArrayList();
		helper(root,ans);
	}
	
	
   public static void Print(TreeNode root, int k) {
		
		ArrayList<Integer> ans= new ArrayList();
		helper(root, ans, 0, k);
	}
	public static void helper(TreeNode root, ArrayList<Integer> ans,int sum, int k) {
	// TODO Auto-generated method stub
		if(root==null) { // -ve Base 
//			System.out.println(ans);
			return;
		}
		
		if(root.left==null && root.right==null) { // +ve Base Case
			ans.add(root.data);
			if((k+ root.data)==sum) {
				System.out.println(ans);
			}
			ans.remove(ans.size()-1);
			return;
		}
		
		if(sum>k) {
			return;
		}
		
		 ans.add(root.data);
		 helper(root.left, ans, sum+ root.data, k);
		 helper(root.right, ans, sum+ root.data, k);
		 ans.remove(ans.size()-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// 1 2 4 null null null 3 null null
		MyTree t= new MyTree();
		Print(t.root);
		
	}

}
