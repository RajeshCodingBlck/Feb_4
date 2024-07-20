package MyLinkedList;

public class Client_LinkList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       MyLinkList list= new MyLinkList();
       list.display();
       System.out.println();
//       list.addAtBegin(10);
//       list.display();
//       System.out.println();
//       
//       list.addAtBegin(40);
//       list.display();
//       System.out.println();
//       
//       list.addAtBegin(50);
//       list.addAtBegin(60);
//       
//       list.display();
//       System.out.println();
       
//        list.addAtBegin(45);
//        list.display();
//        System.out.println();
//        list.addAtlast(60);
//        list.display();
//        System.out.println();
//        list.addAtlast(70);
//        list.display();
//        System.out.println();
       
        list.addAtlast(40);
        list.display();
        System.out.println();
        list.addAtBegin(60);
        list.addAtlast(70);
        list.display();
        System.out.println();
        
        list.removeAtBegin();
        list.display();
        System.out.println();
        
        list.removeAtEnd();
        list.display();
        System.out.println();
        
        
         
        
       
       
       
	}

}
