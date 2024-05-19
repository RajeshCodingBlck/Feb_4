package LinkList_pkg;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		 Node n1= new Node(23);
		 Node n2= new Node(34);
		 Node n3= new Node(45);
		 Node n4= new Node(56);
		 // How to Create a link
		 n1.next=n2;
		 n2.next=n3;
		 n3.next=n4;
		 
		 // Give another name to any Node.
		 Node head= n1;
		 Node tail=n4;
		 
		 System.out.println(n1.data);
		 System.out.println(head.data);
		       
	}

}
