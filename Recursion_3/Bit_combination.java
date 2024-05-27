package Recursion_3;

public class Bit_combination {
    
	static int count=0;
	public static int PrintBitCombination(int n, String ans) {
		
		if(n==0) {
			count++;
			System.out.println(ans);
			return 1;
		}
		int mera_ans=0;
		int chhota_ans1=PrintBitCombination(n-1, "0"+ ans);
		int chhota_ans2=PrintBitCombination(n-1, "1"+ ans);
		
		mera_ans=chhota_ans1+chhota_ans2;
		return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=PrintBitCombination(3, "");
		
		System.out.println(count);
	}

}
