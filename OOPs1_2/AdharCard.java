package OOPs1_2;

public class AdharCard {

	String name;
	int age;
	
	static int count=0;
	
	AdharCard(String name){
		this.name=name;
		count++;
	}
	AdharCard(String name, int age){
		this.name=name;
		this.age=age;
		count++;
	}
	
	
}
