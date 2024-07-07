package DynamicStack;

import java.util.Stack;

public class inBuitStack {

	public static void insertAtBottom(Stack<Integer> st, int val) {
		
		Stack<Integer> newStack= new Stack();
		while(st.size()>0) {
			
			int top=st.pop();
			newStack.push(top);
			
		}
		st.push(val);
		while(newStack.size()>0) {
			
			int top= newStack.pop();
			st.push(top);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<Integer> st= new Stack();
      
      st.push(3);
      st.push(2);
      st.push(1);
      System.out.println(st);
       //st.pop();
      insertAtBottom(st,4);
      System.out.println(st);
      
	}

}
