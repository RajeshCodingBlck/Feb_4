package function_demo;

public class create_function {
   
	~
	public  static void add() {	
		System.out.println("add is Start");
		int a=23;
		int b=14;
		System.out.println(a+b);
		sub();
		System.out.println("add is end");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("main is Start");
       add(); // function ko call kiya jata he.
       System.out.println("main is end");
	}
	public static void sub() {
		System.out.println("Sub is Start");
		int a=23;
		int b=14;
		System.out.println(a-b);
		System.out.println("sub is end");
		
	}

}
