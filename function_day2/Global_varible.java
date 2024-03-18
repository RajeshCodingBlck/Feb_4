package function_day2;

import java.util.Scanner;

public class Global_varible {

	
    static int a=10;
    
    public static void fun() {
    	
    	a=12;
    	System.out.println(a);
    	fun2();
    }
    public static void fun2() {
    	
    	a++;
    	System.out.println(a);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         fun();
		System.out.println(a);
		
		//System.out.println(fun(12,13));
	}

}
