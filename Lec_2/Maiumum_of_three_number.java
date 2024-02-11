package Lec_2;

import java.util.Scanner;

public class Maiumum_of_three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int a= s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is Maximum");
		}else if(b>c) {
			System.out.println("b is Maximum");
		}else {
			System.out.println("c is Maximum");
		}
		
		
	}

}
