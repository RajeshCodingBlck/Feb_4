package MyLinkedList;

public class client_1_forLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Node n1= new Node(20);
		
		System.out.println(n1.data);
		System.out.println(n1.next);
		
		Node n2= new Node(30);
		Node n3= new Node(40);
		n1.next=n2; // Link n1 and n2 (n1 ->n2)
		
		System.out.println(" n1 address" + n1);
		System.out.println(" n2 address" + n2);
		System.out.println(" n3 address" + n3);
		System.out.println(n1.data);
		System.out.println(n1.next);
		n2.next=n3;
		System.out.println(n2.data);
		System.out.println(n2.next);
		
		Node Head=n1; // Object ko koi Naam dena.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
