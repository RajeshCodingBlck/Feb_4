package My_HashMap;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyHashMap m= new MyHashMap();
		
		m.put("Mohan", 67);
		m.put("Aman",89);
		m.put("Rahul", 56);
		
		m.put("Rahul", 90);
		
		System.out.println(m.get("Mohan"));
		System.out.println(m.get("Rahul"));
		
		System.out.println(m);
		
	}

}
