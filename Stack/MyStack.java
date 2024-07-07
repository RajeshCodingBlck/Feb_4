package Stack;

public class MyStack {
   
	protected int [] arr;
	protected int top; // Index of Top element.
	
	public MyStack(int size){
	   arr= new int [size];	
	   top=-1;
	}
	
	public void push(int val) throws Exception  {
		
		if(top==arr.length-1) {
             //System.out.println("Kyu Daal raha he");
			Exception obj= new Exception("Stack is Overflow");
			  throw obj;
             
		}
		top++;
		arr[top]=val;
	}
	
	public void pop() throws Exception{
		
		if(top==-1) {
			throw new Exception("Kyu nikal raha he");
			
		}
		top--;
	}
	
	public int peek() throws Exception{
		
		if(top==-1) {
			
			throw new Exception("kyu dekh raha he");
			
		}
		return arr[top];
	}
	public int size() {
		
		return top+1;
	}
	
	public boolean IsEmpty() {
		
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	
}
