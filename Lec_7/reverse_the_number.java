package Lec_7;

public class reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=12345;
      
      int reverse_number=0;
      while(n !=0) {
    	  
    	  int last_digit= n%10;
    	  
    	  //sum= sum+last_digit;
    	  reverse_number= reverse_number*10+ last_digit;
    	  n= n/10;
      }
      
      System.out.println(reverse_number);
      
      
	}

}
