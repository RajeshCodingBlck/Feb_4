package Polymorphism;

//"static void main" must be defined in a public class.
//class A{
// 
//void fun(){
//     System.out.println("fun of A is called");
// }
//}
//class B extends A{
// 
// public  void fun(){
//     System.out.println("fun of B is called");
// }
//}
// Visible cann't be reduce....
public class Main {
 public static void main(String[] args) {
     
     A obj = new B();
     obj.fun();
 }
}
public class CaseStudy {
    
//	public static void sum(int a,int b) {
//		
//		System.out.println("Int Sum is Called");
//		System.out.println(a+b);
//	}
	public static void sum(Integer a, Integer b ) {
		System.out.println("Integer Sum is called");
		System.out.println(a+b);
	}
	public static void sum(double a, double b) {
		System.out.println("Double Sum is called");
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(2,3);
		
//		int a=23;
//		Integer b= a; // AutoBoxing
//		int c= b; // Unboxing
		
	}

}
