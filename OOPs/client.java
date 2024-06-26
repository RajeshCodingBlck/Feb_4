package OOPs;

import OOPs1_2.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // AC Object
//		AC Voltas= new AC();
//		
//		
//		System.out.println(Voltas.temp);
//		Voltas.TempInc();
//		System.out.println(Voltas.temp);
//		Voltas.Tempdec();
//		System.out.println(Voltas.temp);
//		
//	  AC  Haier= new AC();
		
		AC Voltas = new AC(16, true, 23);
//		Voltas.temp=16;
//		Voltas.fanMode=true;
//		Voltas.speedOfFan=23;
		
		AC Haier = new AC(24, false, 0);
//		Haier.temp=24;
//		Haier.fanMode=false;
		
		System.out.println(Voltas.temp);
		Voltas.TempInc();
		Haier.TempInc();
		System.out.println(Voltas.temp);
		System.out.println(Haier.temp);
		
		A obj= new A(2);
		System.out.println(obj.val);
		
		
	}

}
