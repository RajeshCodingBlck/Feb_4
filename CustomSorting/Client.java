
package CustomSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class cmp3 implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		if(o1.Name.length() < o2.Name.length()) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Product p1= new Product("Apple", 100000);
		Product p2= new Product("Samsung", 50000);
		Product p3= new Product("Nokia", 1000);
		Product p4= new Product("Oppo", 10000);
		
		ArrayList<Product> arr= new ArrayList();
		
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		
		Collections.sort(arr, new cmp3());
		
		for(Product p : arr) {
			System.out.println(p.Name+ " , "+ p.price);
		}
		
	}

}
