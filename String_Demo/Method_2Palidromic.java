package String_Demo;

import java.util.Scanner;

public class Method_2Palidromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        String str= s.next();
        
        int i=0;
        int j= str.length()-1;
        
        while(i<j) {	
        	char ch1= str.charAt(i);
        	char ch2= str.charAt(j);
        	
        	if(ch1==ch2) {
        		
        	  i++;
        	  j--;
        	}else {
        		System.out.println("False");
        		return;
        	}
        }
        System.out.println("True");
        
        
	}

}
