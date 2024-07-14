package Stack_Question;

import java.util.*;

public class BalanceParethsis {

	public static boolean checkBalance(String str) {
		
		Stack<Character> st= new Stack();
		
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)=='(') {	
				st.push('(');
			}else {
				
				if(st.size()==0) {
					return false;
				}else {
					st.pop();
				}
			}
		}
		
		return st.size()==0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       String str= s.nextLine();
       System.out.println(checkBalance(str));
       
	}

}
