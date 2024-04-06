import java.util.*;
public class Main {
    
	public static int count_digit(long n){

		int count=0;

		while(n>0){

			n=n/10;
			count++;
		}

		return count;
	}
	public static long transform(long n){
     
      int count= count_digit(n);

	  long place_value=1;
	  long ans=0;
    
	   while(count>1){
          
		   int last_digit= (int)(n%10);
          
		  int min_value= Math.min(last_digit, 9-last_digit);
		  ans+= min_value*place_value;

            place_value *=10;
			n=n/10;
	        count--;
	   }

	    if(n==9 || n<=4){
			ans += n*place_value;
		}else{
			ans += (9-n)*place_value;
		}

		return ans;
	}
    public static void main(String args[]) {
       
	   Scanner s= new Scanner(System.in);

	   long x= s.nextLong();

        System.out.println(transform(x));

    }
}
