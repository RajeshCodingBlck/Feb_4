package Tree_pkg;

import java.util.LinkedList;

public class BFS {

	public static void BFS(TreeNode root) {
		if(root==null) {
		    return;
		}
		LinkedList<TreeNode> q= new LinkedList();
		q.add(root);
		
		while(q.size() !=0) {
			
			// remove the front Node
			TreeNode rn = q.removeFirst();
			
			// work on the remove Node
			System.out.print(rn.data+" , ");
			
			// add the children's of remove Node
			if(rn.left !=null) {
				q.addLast(rn.left);
			}
			
			if(rn.right !=null) {
				q.addLast(rn.right);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1 2 4 null null null 3 null null
	   MyTree t= new MyTree();
	   BFS(t.root);
	}

}
