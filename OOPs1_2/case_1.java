package OOPs1_2;

class demo{
	
	int val ; 
	
	demo(int val){
		this.val=val;
	}
	
}
public class case_1 {
    
	public static void swap(demo obj1, demo obj2) {
		
//	   demo temp=obj1;
//	   obj1=obj2;
//	   obj2=temp;
		
		// case-2
		
		int temp= obj1.val;
		obj1.val= obj2.val;
		obj2.val= temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		demo obj1= new demo(1);
		demo obj2= new demo(2);
		
		System.out.println("Before the Swap "+ obj1.val+ " , "+ obj2.val);
		swap(obj1, obj2);
		System.out.println("After the Swap "+ obj1.val+ " , "+ obj2.val);
		
	}

}
