package function_demo;

public class Take_somthing_but_not_return {

	public static void add(int a, int b, double c) {
		
		System.out.println(a+b+c);	
	}
	
	public static void add(int a, double b, int c) {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d=12;
		int e=13;
		double f= 25.0;
		add(d,e,f);
		add(d,e);
		
		
	}

}
