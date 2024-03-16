package function_demo;

public class Return_something_take_nothing {
    
	public static  int add() {
		
		System.out.println("add is Start");
		int a=12;
		int b= 13;
		int sum=a+b;
		System.out.println("add is end");
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main is Start");
	   int ans= add();
	   System.out.println(ans);
	   System.out.println("Main is End");
	}

}
