package String_Demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str1= new String("Hello");
		String str2= new String("Hello");
		
		if(str1==str2) {
			System.out.println("Hum Same He");
		}else {
			System.out.println("Same Nahi he");
		}
		
		
		String str3= "Hello";
		String str4= "Hello";
		
		if(str3==str4) {
			System.out.println("Hum Same He");
		}else {
			System.out.println("Same Nahi he");
		}
		
		str3+='e';
		
		System.out.println(str3);
		System.out.println(str4);
		// Strings are Immutable in Java.
		
//		str.charAt(0)='e'; This Operation Give Error due to String Immutable.
		
		// Inbuit Function
		
		System.out.println(str3.substring(2));
		
		System.out.println(str3.substring(2,6));
		
		
		// If I want to Check Content of two String is Same or not
		
		if(str1.equals(str2)) {
			
			System.out.println("Hum Same He");
		}
		
		
		
		str1="B";
		str4= "a";
		
		System.out.println(str1.compareTo(str4));
		
		if(str1.compareTo(str4)>0) {
			System.out.println(str1);
			
		}else {
			System.out.println(str4);
		}
		
		
	}

}
