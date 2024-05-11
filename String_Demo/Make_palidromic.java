package String_Demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Make_palidromic {

    public static void solve(String str){
     
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

        if(count==0 || count==1){
            System.out.println(0);
        }else{
            System.out.println(count-1);
        }


    }
    public static void main(String args[] ) throws Exception {

        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
       
       while(t>0){
          
          int n= s.nextInt();
          String str= s.next();
          solve(str);
          t--;
       }

    }
}

