package Lec_2;

import java.util.Scanner;

public class Odd_withdivisibleBy_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		
//		if(a%2 == 0) {
//			System.out.println("a is even");
//		}else {
//			
//			if(a%3 ==0) {
//				System.out.println("a is Odd and divisible by 3");
//			}else {
//				System.out.println("a is Odd but not divisible by 3");
//			}
//		}
		
		if(a%2 == 0) {
			System.out.println("a is even");
		}else if(a%3 ==0 ) {
			System.out.println("a is odd and divisible by 3");
		}else {
			System.out.println("a is odd but not divisible by 3");
		}
		
	}

}
