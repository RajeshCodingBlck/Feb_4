package TimeComplexity;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=1000000;
     for(int i=1; i<=n;i++) {
    	 System.out.print("hello World");
     }
     // TC -O(n)
     
     for(int i=1;i<=n;) {
    	 System.out.println("hello World");
    	 i=i*2;
     }
     // TC -> O(log n base 2)
     
     for(int i=n; i>=1;i=i/2) {
    	 System.out.println("hello World"); 
     }
     
//     int i=n;
//     while(i>=1) {
//    	 System.out.println("what is TC");
//    	 i=i/2;
//    	 i=i/3;
//     }
     
//     TC :- O(log n base 6)
     
      for(int i=1; i<=n;) {
    	  System.out.println("Hello");
    	  i=i+2;
      }
      
     
     
     
	}

}
