package String_Demo;

public class Substring {

	public static boolean isPalidromic(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)!= str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	public static void  printSubString(String str) {
		
		for(int s=0; s<str.length();s++) {
			
			for(int e=s; e<str.length();e++) {
				
				System.out.println("Cut is from "+ s+ " "+e +" ");
				
				// Print the Substring
//				for(int k=s; k<=e;k++) {
//					System.out.print(str.charAt(k));
//				}
//				System.out.println();
				
//				System.out.println(str.substring(s,e+1));	// print all Substring 
				
				// Print Only Palidromic Substring
				if(isPalidromic(str.substring(s, e+1))== true) {
					System.out.println(str.substring(s,e+1));
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="aabaa";
      printSubString(str);
      
//      if(true) {
//    	  System.out.println("Chal Gaya me");
//      }else {
//    	  System.out.println("Nahi chala");
//      }
	}

}
