package OOPs1_2;

class A1{
    
    int val1;
    static int val2=12;
    
    A1(){
        val1=24;
    }
    
     public void fun(){
        
        //static int val3=24;    Local Varible 
        //System.out.println(val3);
    }
     
     public static void fun1(){
         // System.out.println(this); // Error Due to Static function have not this keyword..
          System.out.println("hello from  fun1");
      } 
       
}

//"static void main" must be defined in a public class.

class A1{ 
 int val1;
 static int val2=12; 
 A1(){
     val1=24;
 }
 public void fun(){
    
        System.out.println("hello from  fun");
     fun1();
 }
 public  void fun1(){
    // System.out.println(this);
    System.out.println("hello from  fun1");
 }
 
 
}
 class Main1 {
 public static void main(String[] args) {
     
     A1 obj= new A1();
     // System.out.println(obj.val1+ " , "+ A1.val2);
     // A1.fun1();
     System.out.println(A1.val2);
     obj.fun();
     
 }
 
}
public class Static_cases {

	 public static void main(String[] args) {
	        
	        A1 obj= new A1();
	        System.out.println(obj.val1+ " , "+ obj.val2);
	        
	        Integer a=12;
	        
	        final int a1=12;
	        System.out.println(a1);
	        
	        
	    }
}
