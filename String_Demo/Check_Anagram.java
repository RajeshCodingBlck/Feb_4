package String_Demo;

public class Check_Anagram {

	class Solution {
	    public int [] getfre(String str){
	        
	        int [] fre= new int[256];
	        
	        for(int i=0;i<str.length();i++){
	            
	            int ascii=str.charAt(i);
	            fre[ascii]=fre[ascii]+1;
	        }
	        
	        return fre;
	    }
	    public boolean isAnagram(String s, String t) {
	        
	        
	        int [] fre1=getfre(s);
	        int [] fre2= getfre(t);
	       
	        for(int i=0; i<256;i++){
	            
	            if(fre1[i]==fre2[i]){
	                continue;
	            }else{
	                return false;
	            }
	        }
	        
	        return true;
	        
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
