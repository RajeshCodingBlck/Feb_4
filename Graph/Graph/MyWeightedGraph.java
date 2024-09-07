package Graph;

import java.util.ArrayList;
import java.util.*;

class Tuple implements Comparable<Tuple>{
	
	int current_node;
	int minimumWeight;
	String path;
	
	Tuple(int current_node, int minimumWeight,
			String path){
		this.current_node=current_node;
		this.minimumWeight=minimumWeight;
		this.path=path;
	}

	@Override
	public int compareTo(Tuple o) {
		// TODO Auto-generated method stub
		
		if(this.minimumWeight< o.minimumWeight) {
			return -1;
		}else {
			return 1;
		}
	}
}

class Pair{
	
	int nb;
	int weight;
	
	Pair(int nb , int weight){
		this.nb=nb;
		this.weight=weight;
	}
}
public class MyWeightedGraph {
   
	ArrayList<Pair> [] arr;

	MyWeightedGraph(int n){
		arr= new ArrayList [n];
		for(int i=0; i<n;i++) {
			arr[i]= new ArrayList();
		}	
	}
	
	public void addEdges(int u, int v, int w) {
		
		arr[u].add(new Pair(v,w));
		arr[v].add(new Pair(u,w));
	}
	
	public void dijkstra(int src) {
		
		PriorityQueue<Tuple>pq =new PriorityQueue();
		
		int []visited= new int[arr.length];
		
		while(pq.size()>0) {
			
			// remove
			Tuple rm= pq.remove();
			
			if(visited[rm.current_node]==1) {
				continue;
			}
			visited[rm.current_node]=1;
			// work
			System.out.println(rm.current_node+" "+
			rm.minimumWeight+ " "+ rm.path);
			// add the neighbour
			 
			ArrayList<Pair> list_nb= arr[rm.current_node];
			
			for(Pair p : list_nb) {
				if(visited[p.nb]==0) {	
					pq.add(new Tuple(
							p.nb,
		             rm.minimumWeight+ p.weight,
		            rm.path+ p.nb));
				}
			}
			
		}
	}
	
	
	
	
	
}
