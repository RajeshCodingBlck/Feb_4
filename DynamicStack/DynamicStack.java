package DynamicStack;

import Stack.MyStack;

public class DynamicStack  extends MyStack{

	DynamicStack(){
		super(5);
		
	}
	
	public void push(int val) throws Exception{
		
		if(super.top == arr.length-1) {
			
			int [] old_arr= super.arr;
			super.arr= new int [2*old_arr.length];
			
			for(int i=0; i<old_arr.length;i++) {
				arr[i]= old_arr[i];
			}
		}
		
		super.push(val);
	}
	
	public String toString() {
//		
//		String ans="[ ";
//		for(int i=0; i<=super.top;i++) {
//			ans+=  super.arr[i];
//			ans+=" ";
//		}
//		ans +=  "]";
//		return ans;
		
		return "Hi";
		
	}
}
