package Lec_7;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int divisor=16;
		int dividend=7;
		
		while(dividend%divisor !=0 ) {
			
			int rem= dividend%divisor;
			dividend= divisor;
			divisor=rem;
			
		}
		
		System.out.println(divisor);
		
		
		
	}

}
