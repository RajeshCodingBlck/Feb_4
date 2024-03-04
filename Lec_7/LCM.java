package Lec_7;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor=16;
		int dividend=7;
		int val= divisor*dividend;
		while(dividend%divisor !=0 ) {
			
			int rem= dividend%divisor;
			dividend= divisor;
			divisor=rem;
			
		}
		int lcm= val/divisor;
		
		System.out.println(divisor+ " "+ lcm);
		
	}

}
