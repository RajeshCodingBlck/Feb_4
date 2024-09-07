package Graph;

import java.util.*;

public class MyGraph {
    
	
	  ArrayList<Integer> [] arr;
	  
	  MyGraph(int n){
		  arr= new ArrayList[n];  
		  for(int i=0; i<n;i++) {
			  arr[i]= new ArrayList();
			 // System.out.println(arr[i]);
		  }
	  }
	  
	  public void addEdge(int u, int v) {
		  
		  arr[u].add(v);
		  arr[v].add(u);
	  }
	  
	  public void Display() {
		  
		   for(int i=0; i<arr.length;i++) {  
			   System.out.println(i + "-> "+ arr[i]);
		   }
		   
	  }
	  
	  public void ComponentBFS(int src, int [] visited) {
		  
		  
		  LinkedList<Integer> q= new LinkedList();
		  q.add(src);  
		  visited[src]=1;
		  while(q.size()>0) {
			  // remove
			  int rn= q.removeFirst();
			  
			  // work
			  System.out.print(rn+ " "); 
			  // add His Neighbour
			   ArrayList<Integer> list= arr[rn];
			   for(int  nb : list ) {  
				   if(visited[nb]==0) {
					   q.addLast(nb);
					   visited[nb]=1;
				   }
			   }
			  
		  }
	  }
	  
	  public void bfs() {
		  
		  int [] visited= new int[arr.length]; 
		  int countComponent=0;
		  for(int i=0; i<visited.length;i++) {	  
			  if(visited[i]==0) {
				  countComponent++;
				  ComponentBFS(i, visited);
			  }
		  }
	  }
	  
	  public void dfsHelper(int src, int [] visited) {
		  
		  System.out.print(src+ " ");
		  visited[src]=1;
		  
		  ArrayList<Integer> list_nb= arr[src];
		  for(int  nb : list_nb) { 
			  if(visited[nb]==0) {
				  dfsHelper(nb, visited);
			  }
		  }
		  
	  }
	  public void dfs() {
		  
		  int [] visited= new int[arr.length];   
		  int countComponent=0;
		  for(int i=0; i<visited.length;i++) {	  
			  if(visited[i]==0) {
				  countComponent++;
				  dfsHelper(i, visited);
			  }
		  }
		  
	  }
	  
	  
}
