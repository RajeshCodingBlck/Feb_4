package String_Demo;

import java.util.Scanner;

public class Frequency_of_eachChaaracter {

	public static void PrintAllfre(String str) {
		// To Store Frequency of Each Character.
		int [] fre= new int [256];
		
		for(int i=0; i<str.length();i++) {	
			int ascii= str.charAt(i);	
			fre[ascii]=fre[ascii]+1;
		}
		
		for(int i=0; i<256;i++) {
			
			if(fre[i]>0) {	
				char ch= (char)(i);
				System.out.println(ch+ " -> "+ fre[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      char ch='0';
//      
//      int ascii= ch;
//      System.out.println(ascii);
		
		Scanner s= new Scanner(System.in);
		
		String str= s.next();
		PrintAllfre(str);
		
		
      
	}

}
