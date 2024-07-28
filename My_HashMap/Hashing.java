package My_HashMap;

public class Hashing {

//	[0,20];
	// Mapping karne me help kar raha he  String ko Integer ke Sath
	
	public static int hashFunction(String str) {
		
		int  hashValue= str.hashCode();
		int Map_value=  Math.abs(hashValue)%21;
		return Map_value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		String str= "Hello";
//		
//		Integer val= 23;
//		System.out.println(val.hashCode());
//		System.out.println(str.hashCode()%11);
		
		System.out.println(hashFunction("Rahul"));
		System.out.println(hashFunction("Mohan"));
		
		int val= 4;
		System.out.println(4>>1);
		
		
		
		
	}

}
