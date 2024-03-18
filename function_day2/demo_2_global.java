package function_day2;

public class demo_2_global {

	static int a=14;
	public static void fun2() {
		a--;	
	}
	public static void fun() {	
		int a=10;
		a++;
		fun2();
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(a);
		fun();
		System.out.println(a);
		
		
	}

}
