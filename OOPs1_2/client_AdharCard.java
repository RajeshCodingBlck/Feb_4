package OOPs1_2;

public class client_AdharCard {

	public static void main(String[] args) {
		
		AdharCard obj1= new AdharCard("Mohan", 23);
		AdharCard obj2= new AdharCard("Sohan", 23);
		
		System.out.println(obj1.name + " "+ obj2.name);
		System.out.println(AdharCard.count);
		
		
	}
}
