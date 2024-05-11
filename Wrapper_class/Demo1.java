package Wrapper_class;

public class Demo1 {
   
	public static void Increase(int a, Integer a1) {
		
		a++;
		a1++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=12;
       
       Integer a1=12;
       System.out.println(a);
       System.out.println(a1);
       Increase(a, a1);
       System.out.println(a);
       System.out.println(a1);
       
       // new 
//       Integer a2= new Integer(34);
//       System.out.println(a2);
       
         int c= 13;  
         Integer c2= c; // autoboxing
         
         
         Integer d=14;
         int d1=d;   // unboxing
         
         
       
         Integer a11=12;
         Integer a22=12;
         Integer b11=1234;
         Integer b22= 1234;
         
         if(a11==a22) {
        	 System.out.println("Hum to Equal he");
         }else {
        	 System.out.println("Hum Equal Nahi he");
         }
         
         if(b11==b22) {
        	 System.out.println("Hum to Equal he");
         }else {
        	 System.out.println("Hum Equal Nahi he");
         }
         
       
	}

}
