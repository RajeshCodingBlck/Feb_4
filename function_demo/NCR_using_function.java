package function_demo;

public class NCR_using_function {

	public static int fact(int n) {
		
		int product=1;
		for(int i=1; i<=n;i++) {
			product=product*i;
		}
		return product;
	}
	public static int ncr(int n, int r) {
		
		
		int n_fact=fact(n);
		int r_fact=fact(r);
		int n_minus_r_fact=fact(n-r);
		
		int ncr= (n_fact)/(r_fact*n_minus_r_fact);
		
		return ncr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println(ncr(5,3));
	}

}
