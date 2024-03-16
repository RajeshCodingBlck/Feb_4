package function_demo;

public class fun_demo2 {

	public static void fun1() {
		
		System.out.println("fun1 is Start");
		System.out.println("hello for fun1");
		System.out.println("fun1 is end");
	}
	public static void fun2() {
		System.out.println("fun2 is Start" );
		System.out.println("Hello from fun2");
		fun1();
		System.out.println("fun2 is end");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		fun2();
		
	}

}
