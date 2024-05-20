package Recursion_2;

public class A_pow_b {
   
	public static int Pow(int a, int b) {
		
		if(b==0) {
			return 1;
		}
		
		int chhota_ans=Pow(a, b-1);
		int mera_ans= a*chhota_ans;
		
		return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(Pow(2,5));
	}

}
