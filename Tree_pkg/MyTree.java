package Tree_pkg;

import java.util.LinkedList;
import java.util.Scanner;

public class MyTree {

	TreeNode root;
	Scanner s= new Scanner(System.in);
	
	MyTree(){
		//root= Build();
		root=BFS();
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
	
	private TreeNode BFS() {
		
		 LinkedList<TreeNode> q= new LinkedList<>();
		 
		 System.out.println("Enter the root data");
		 int data= s.nextInt();
		 if(data==-1) {
			 return null;
		 }
		 TreeNode root= new TreeNode(data);
		 q.add(root);
		 
		 while(q.size() !=0) {
			 
			 // remove the front Node
			 TreeNode rn = q.removeFirst();
			 
			 // work , Create a child of remove Node
			 // Left Child Create
			  System.out.println("Enter the left child of "+ rn.data);
			  int leftData= s.nextInt();
			  if(leftData==-1) {
				  rn.left=null;
			  }else {
				  TreeNode leftChildNode= new TreeNode(leftData);
				  rn.left=leftChildNode;
			  }
			  
			  // Right Child Create
			  System.out.println("Enter the Right child of "+ rn.data);
			  int RightData= s.nextInt();
			  if(RightData==-1) {
				  rn.right=null;
			  }else {
				  TreeNode RightChildNode= new TreeNode(RightData);
				  rn.right=RightChildNode;
			  }
			  
			  
			  // add The Children
			  if(rn.left !=null) {
				  q.addLast(rn.left);
			  }
			  
			  if(rn.right !=null) {
				  q.addLast(rn.right);
			  }
			  
		 }
		 
		 return root;
	}
	
}
