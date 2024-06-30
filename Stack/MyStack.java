package Stack;

public class MyStack {
   
	private int [] arr;
	private int top; // Index of Top element.
	
	MyStack(int size){
	   arr= new int [size];	
	   top=-1;
	}
	
	public void push(int val) {
		
		if(top==arr.length-1) {
             System.out.println("Kyu Daal raha he");
             return;
		}
		top++;
		arr[top]=val;
	}
	
	public void pop(){
		
		if(top==-1) {
			System.out.println("Kyu Nikal raha he");
			return;
		}
		top--;
	}
	
	public int peek() {
		
		if(top==-1) {
			System.out.println("Kyu Dekh raha he");
			return -1;
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
