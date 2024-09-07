package Graph;

import java.util.*;

public class client {

//	5
//	6
//	0 1
//	0 2
//	1 2
//	1 3
//	2 4
//	3 4
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      MyGraph g= new MyGraph(5);
//      
////      g.addEdge(0, 1);
////      g.addEdge(0, 2);
////      g.addEdge(1, 2);
////      g.addEdge(1, 3);
////      g.addEdge(2, 4);
////      g.addEdge(3, 4);
//      
//      g.Display();
		
		Scanner s= new Scanner(System.in);
		
		
		int n= s.nextInt();
		int e= s.nextInt();
		
		// ArrayList<Integer> [] arr= new ArrayList[n];
		MyGraph g= new MyGraph(n);
		
		for(int i=0; i<e;i++) {
			
			int u= s.nextInt();
			int v= s.nextInt();
			g.addEdge(u, v);
			
//			arr[u].add(v);
//			  arr[v].add(u);
		}
		
		 g.dfs();
		
		//g.Display();
		
      
	}

}
