package Recursion_3;
import java.util.ArrayList;

public class Recursion_3 {
   
	public static ArrayList<String> Combination(int n){
		
//	  if(n==1) {
//		 ArrayList<String> base_ans= new ArrayList(); 
//		 base_ans.add("H");
//		 base_ans.add("T");
//		 
//		 return base_ans;
//	  }
		
		if(n==0){
			
			ArrayList<String> base_ans= new ArrayList();
			base_ans.add("");
			return base_ans;
		}
		
	  ArrayList<String> chhota_ans=Combination(n-1); 
	  ArrayList<String> mera_ans= new ArrayList();
	  
	  for(int i=0; i<chhota_ans.size();i++) {  
		  mera_ans.add("H"+ chhota_ans.get(i));
	  }
	  
     for(int i=0; i<chhota_ans.size();i++) {	  
		  mera_ans.add("T"+ chhota_ans.get(i));
	  }
     
          return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	 int n=3;
	 System.out.println(Combination(n));
	}

}
