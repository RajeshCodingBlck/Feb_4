package Recursion_3;

public class Climbing_Stair {
    
	public static void PrintStairs(int n, String ans) {
		
		
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		
		if(n<0) {
			return ;
		}
		
		// 1 ka jump
		PrintStairs(n-1, ans+"1");
		
		// 2 ka jump
		PrintStairs(n-2, ans+"2");
		
		
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		PrintStairs(5,"");
	}

}
