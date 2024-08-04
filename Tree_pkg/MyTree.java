package Tree_pkg;

import java.util.Scanner;

public class MyTree {

	TreeNode root;
	Scanner s= new Scanner(System.in);
	
	MyTree(){
		root= Build();
	}

	private TreeNode Build() {
		
		System.out.println("Enter the data");
		String data= s.next();
		
		if(data.equals("null")) {
			return null;
		}
		
		TreeNode root=new TreeNode(Integer.parseInt(data));
		System.out.println("Enter the left child of "+ data);
		 root.left= Build(); // left Sub
		 System.out.println("Enter the right child of "+ data);
		 root.right=Build();
		
		 return root;
		
	}
	
}
