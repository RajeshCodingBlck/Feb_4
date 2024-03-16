package function_demo;

public class demo_2_return_something {
    
//	public static int add() {
//		System.out.println("add is Start");
//		int a=12;
//		int b=13;
//		int sum=a+b;
//		System.out.println("add is End");
//		return sum;
//	}
//	 public static int add(){
//	        
//	        int a=12;
//	        int b=13;
//	         return a+b;
//	        System.out.println("Add is End");
//	        
//	    }
	
//	Error due to return keyword forcully erase the add meromry
	public static int add() {
		System.out.println("Hello from Add Function");
		int a=12;
		int b=13;
		return a+b;
		
	}
	
//public static int add(){
//        
//        int a=12;
//        int b=13;
//       
//        if(a !=12){
//            return a+b; // Conditional returning
//        }
//        
//        return 12;
//        
//    }
	
//	 public static void add(){
//	        
//         int a=12;
//        int b=13;
//        System.out.println(a+b);
//        return;
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main is Start");
		System.out.println(add());
		System.out.println("Main is end");
		
	}
	
//	public static void add(){
//        
//        int a=12;
//       int b=13;
//       System.out.println(a+b);
//       
//   }
//   public static void main(String[] args) {
//       
//       System.out.println(add());
//       
//   }

}
