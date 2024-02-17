package Lec_3;
import java.util.*;
public class first_n_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		int i=1; // i denote ith  Natural number
		
		while(i<=n) {
			System.out.println(i);
			i=i+1;
		}
		
		
	}

}
