package Recursion_3;

public class PrintSubsequence {
    
	public static void Printsubsequence(String str, String ans) {
		
		 if(str.length()==0) {
			 System.out.println(ans);
			 return ;
		 }
		
		char ch= str.charAt(0);
		Printsubsequence(str.substring(1),ans+"");
		Printsubsequence(str.substring(1), ans+ch);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Printsubsequence("abc", "");
		
	}

}
