package Lec_5;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=15;
       
       int row=1;
       int nsp=n-1;
       int nst=1;
       int val=1;
       while(row<=n) {
    	   
    	   // Print the Space
    	   int i=1;
    	   while(i<=nsp) {
    		   System.out.print(" "+"\t");
    		   i=i+1;
    	   }
    	   
    	   int j=1;
    	   while(j<=nst) {
    		   System.out.print(val+"\t");
    		   val=val+1;
    		   j=j+1;
    	   }
    	   
    	   // Preparation for Next row
    	   nst=nst+2;
    	   nsp=nsp-1;
    	   
    	   System.out.println();
    	   row=row+1;
    	   
       }
       
	}

}
