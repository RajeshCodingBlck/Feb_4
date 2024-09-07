package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class client2 {

	public static void dfshelper(int src, int []visited
			, ArrayList<Pair> [] arr) {
		
		System.out.println(src);
		visited[src]=1;
		
		ArrayList<Pair> list_nb= arr[src];
		for( Pair p : list_nb) {	
			if(visited[p.nb]==0) {
				dfshelper(p.nb, visited, arr);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWeightedGraph g= new MyWeightedGraph(5);
		
	     Scanner s= new Scanner(System.in);
	     for(int i=0; i<6;i++) {	 
	    	 int u= s.nextInt();
	    	 int v= s.nextInt();
	    	 int w= s.nextInt();	 
	    	 g.addEdges(u, v, w);
	     }
	     
	     int [] visited= new int[5];
	     dfshelper(0,visited, g.arr );
	     
	     
		
	}

}
