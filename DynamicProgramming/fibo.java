package DynamicProgramming;

import java.util.HashMap;

public class fibo {

	// Take N -> return Nth fibonacci
	public static int fibo(int n, HashMap<Integer, Integer> brain) {
		
		
		if(n==0 || n==1) {
			return n;
		}
		
		if(brain.containsKey(n)) { // Search kar rahe he kaafi N ke liye kaam kiya he nahi
			return brain.get(n);
		}
		
		System.out.println("N is "+ n);
		int chhota_ans1= fibo(n-1, brain);
		int chhota_ans2= fibo(n-2, brain);
		
		int mera_ans= chhota_ans1+chhota_ans2;
		brain.put(n, mera_ans); // Memorize 
		return mera_ans;
		
	}
	
  public static int fibo(int n, int [] brain) {
		
		
		if(n==0 || n==1) {
//			brain[n]=n;
			return n;
		}
		
		if(brain[n] !=0 ) { // Search kar rahe he kaafi N ke liye kaam kiya he nahi
			return brain[n];
		}
		
		System.out.println("N is "+ n);
		int chhota_ans1= fibo(n-1, brain);
		int chhota_ans2= fibo(n-2, brain);
		
		int mera_ans= chhota_ans1+chhota_ans2;
		//brain.put(n, mera_ans); // Memorize 
		//brain[n]=mera_ans;
		return brain[n]=mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<Integer, Integer> brain= new HashMap();
//		int n=10;
//		int [] brain= new int[n+1];
//		System.out.println(fibo(n, brain));
		
		int a=12;
		int b=13;
		int c=14;
		
		a=b=c;
		System.out.println(13);
		System.out.println(a);
	}

}
