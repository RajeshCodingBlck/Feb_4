package Polymorphism;

public class client {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
         car obj = new farari();
         obj.fun();
         obj.IncreaseSpeed();
         System.out.println(((farari)obj).d);
	}

}
