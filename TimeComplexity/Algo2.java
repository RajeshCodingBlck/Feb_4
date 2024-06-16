package TimeComplexity;

public class Algo2 {
    
	public static int Sum(int n) {
		
		int ans= (n*(n+1))/2;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		long start= System.nanoTime();
		 Sum(10000);
		 long end= System.nanoTime();
		 System.out.println(end-start);
	}

}
