import java.util.*;
public class Main {
	public static int digit_count(int n){

		int count=0;

		while(n>0){

			n=n/10;
			count++;
		}

		return count;
	}
	public static int fun1(int n, int count){

         int sum=0;

		while(n>0){

           int last_digit= n%10;

		   sum+= (int)Math.pow(last_digit, count);

		   n=n/10;

		}

		return sum;
	}
    public static void main(String args[]) {
      
	  Scanner s= new Scanner(System.in);

	  int n= s.nextInt();

	  int count = digit_count(n);

	  int rhs= fun1(n, count);

	  if(n== rhs){
		  System.out.println(true);
	  }else{
		  System.out.println(false);
	  }



    }
}
