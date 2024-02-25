package Lec_6;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();		
		int factor_count=0;
		
		for(int i=1; i<=n;i++) {
			
			if(n%i ==0) {
				factor_count++;
			}
			
			if(factor_count>2) {
				break;
			}
		}
		
		if(factor_count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
