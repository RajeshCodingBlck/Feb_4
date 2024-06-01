package Recursion_4;

import java.util.Scanner;

public class RatInMaze {
   
	public static void Print(int curr_r,int  curr_c, 
			         int des_r, int des_c, String ans) {
		
		if(curr_r==des_r && curr_c==des_c) {
			System.out.println(ans);
			return;
		}
		
		if(curr_r> des_r) {
			return;
		}
		if(curr_c> des_c) {
			return ;
		}
		
		// Right Move 
		Print(curr_r, curr_c+1, des_r, des_c, ans+"R");
		// Down Move
		Print(curr_r+1, curr_c, des_r, des_c, ans+"D");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m=s.nextInt();
		
		Print(0,0, n-1, m-1, "");
	}

}
