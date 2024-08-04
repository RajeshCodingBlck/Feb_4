package Tree_pkg;

import java.util.ArrayList;

public class client {

	public static void preOrder(TreeNode root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + "  ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void Inorder(TreeNode root) {

		if (root == null) {
			return;
		}

		Inorder(root.left);
		System.out.print(root.data + "  ");
		Inorder(root.right);
	}

	public static void Postorder(TreeNode root) {

		if (root == null) {
			return;
		}

		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.data + "  ");
	}
	
	public static void preOrder(TreeNode root, ArrayList<Integer> arr) {
		
		if(root==null) {
			return;
		}
		arr.add(root.data);
		preOrder(root.left, arr);
		preOrder(root.right, arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeNode n1= new TreeNode(1);
//		TreeNode n2= new TreeNode(2);
//		TreeNode n3= new TreeNode(3);
//		
//		TreeNode n4= new TreeNode(4);
//		TreeNode n5= new TreeNode(5);
//		
//		n1.left=n2;
//		n1.right=n3;
//		
//		n2.left= n4;
//		n2.right=n5;

//      1 2 4 -1 -1 5 -1 -1 3 -1 -1
//      1 2 4 null null 5 null null 3 null null
		MyTree t = new MyTree();

		preOrder(t.root);
		ArrayList<Integer> arr= new ArrayList();
		preOrder(t.root, arr);
		System.out.println();
		System.out.println(arr);

	}

}
