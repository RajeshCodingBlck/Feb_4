package Recursion_4;

public class Stair_with_dice {
   
	public static void Print(int n, String ans) {
		
		
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		if(n<0) {
			return ;
		}
		for(int i=1;i<=6;i++) {
			Print(n-i, ans+i);
		}
		
//		// dice 1
//		  Print(n-1, ans+1);
//		// dice 2
//		  Print(n-2, ans+2);
//		// dice 3
//		  Print(n-3, ans+3);
//		// dice 4
//		  Print(n-4, ans+4);
//		// dice 5
//		  Print(n-5, ans+5);
//		// dice 6
//		  Print(n-6, ans+6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print(7,"");
	}

}
