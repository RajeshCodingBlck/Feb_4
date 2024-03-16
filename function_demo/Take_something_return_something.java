package function_demo;

import java.util.Scanner;

public class Take_something_return_something {
    
	public static int add(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
	
		System.out.println(add(3,15));
		System.out.println(add(12,15));
//		int a=3;
//		int b=15;
//		System.out.println(a+b);
//		a=12;
//		b=15;
//		System.out.println(a+b);
		
	}

}
