import java.util.*;
public class Main {
	public static long inverse(int n){

		int place_value=1;
		long  ans=0;

		while(n>0){

			int last_digit= n%10;

			int naya_place_value= last_digit;
			int naya_value= place_value;

			ans += naya_value*(long)(Math.pow(10, naya_place_value-1));
			n=n/10;
			place_value++;
		}

		return ans;
	}
    public static void main(String args[]) {


        Scanner s= new Scanner(System.in);

		int n=  s.nextInt();

		long ans= inverse(n);

		System.out.println(ans);

    }
}
