package CustomSorting;

public class Product implements Comparable<Product> {

	
	String Name;
	int price;
	
	Product(String Name, int price){
		this.Name= Name;
		this.price=price;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		
		if(this.price< o.price) {
			return -1;
		}else {
			return 1;
		}
	}
}
