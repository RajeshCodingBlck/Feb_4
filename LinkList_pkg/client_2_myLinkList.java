package LinkList_pkg;

import java.util.Scanner;

public class client_2_myLinkList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   
	  MyLinkList list= new MyLinkList();
//	  
//	  list.insertAtStart(10);
//	  list.insertAtStart(30);
//	  list.insertAtStart(40);
	  
//	  Scanner s= new Scanner(System.in);  
//	  int n= s.nextInt();  
//	  for(int i=1; i<=n;i++) {
//		  
//		  int val= s.nextInt();
//		  list.insertAtStart(val);
//	  }
//    list.insertAtStart(40);
	  list.InsertAtEnd(45);
	  list.InsertAtEnd(46);
	  list.InsertAtEnd(47);
	  list.display();
	  list.deleteAtBegin();
	  System.out.println();
	  list.display();
	  
	  list.deleteAtBegin();
	  System.out.println();
	  list.display();
	}

}
