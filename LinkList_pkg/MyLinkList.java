package LinkList_pkg;

public class MyLinkList {

	
	private Node head;

	MyLinkList(){
		head=null;
	}
	
	// Insert a node at Beginning.
	public void insertAtStart(int val) {
		
		// Create a Node
		Node new_node= new Node(val);
		new_node.next=head;
		head=new_node;
	}
	
	public void display() {
		
		Node temp=head;		
		while(temp !=null) {
			
		   System.out.print(temp.data+" -> ");
		   temp=temp.next;
		}	
	}
	
	public void InsertAtEnd(int val) {
		
		// LinkList is Empty
		if(head==null) {
			
			insertAtStart(val);
			return ;
		}
	    // Find the Tail
		 Node temp= head;
		 
		 while(temp.next !=null) {		 
			 temp=temp.next;
		 }
		 // create a Node
		 Node new_node= new Node(val);
		 temp.next=new_node;
		 	 
	}
	
	public void deleteAtBegin() throws Exception{
		
		if(head==null) {
			throw new Exception("LinkList is Empty");
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
	}
	
}
