package inheritance_demo;

public class B extends A{
   
	int val2;
	B(int val2){
		super(13); // This should be first Statement in your constructor.
		this.val2=val2;
	}
	
	public void fun() {
		
		System.out.println(super.val1);
	}
	
//	public static void fun2(){ Error Static function doesn't this and super.
//        System.out.println(super.val1);
//  }
	
}
