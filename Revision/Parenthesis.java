package Revision;

import java.util.*;

public class Parenthesis {
    public static boolean isValid(String str) {
    	
    	int count=0;
    	for(int i=0; i<str.length();i++) {
    		if(str.charAt(i)=='(') {
    			count++;
    		}else {
    			if(count==0) {
    				return false;
    			}
    			count--;
    		}
    	}
    	
       if(count==0) {
    	   return true;
       }else {
    	   return false;
       }
    }
    public static void helper(int rem_open, int rem_close, String ans
    		,List<String> arr) {
    
    	if(rem_open==0 && rem_close==0) {
    		
    		if(isValid(ans)) {
//    			System.out.println(ans);
    			arr.add(ans);
    		}
    		return;
    	}
    	if(rem_open<0) {
    		return;
    	}
    	if(rem_close<0) {
    		return ;
    	}
    	if(rem_open> rem_close) {
    		return;
    	}
      // Opening Bracket
      helper(rem_open-1,rem_close, ans+"(", arr);
      // Closing Bracket
      helper(rem_open, rem_close-1, ans+")", arr);
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> arr= new ArrayList();
         helper(7,7, "", arr);
//          System.out.println(arr);
//         for(String str : arr) {
//        	 System.out.println(str);
//         }
         for(int i=0; i<arr.size();i++) {
        	 System.out.println(arr.get(i));
         }

      
      
	}

}
