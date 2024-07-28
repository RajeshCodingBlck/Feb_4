package My_HashMap;

import java.util.HashMap;

public class InBuit_HashMap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		HashMap<String, Integer>m = new HashMap();
		
		// Add the (key , value)
		m.put("Rohan", 45);
		m.put("Sohan", 67);
		
		System.out.println(m);
		
		// Read 
		System.out.println(m.get("Sohan"));
		
		
		// update
		m.put("Sohan", 60);
		
		// remove
//		m.remove("Sohan");
		
		System.out.println(m);
		
		System.out.println(m.containsKey("Sohan"));
		
		
		
		
		
		
		
	}

}
