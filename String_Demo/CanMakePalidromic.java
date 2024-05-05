package String_Demo;

import java.util.Scanner;

public class CanMakePalidromic {

	public static boolean canMadePali(String str) {
		
	    int [] fre= new int[256];
	    
	    for(int i=0; i<str.length();i++) {
	    	
	    	int ascii= str.charAt(i);
	    	
	    	fre[ascii]= fre[ascii]+1;
	    }
	    
	    int count=0;
	    
	    for(int i=0; i<256;i++) {
	    	
	    	if(fre[i]%2 ==1) {
	    		count++;
	    	}
	    }
	    
	    if(count>1) {
	    	return false;
	    }else {
	    	return true;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s= new Scanner(System.in);
         
         String str= s.next();
         System.out.println(canMadePali(str));
         
	}

}
