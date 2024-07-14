package Stack_Question;

import java.util.*;

public class InsertAtBottom {

	public static void InsertAtBottom(Stack<Integer> st, int val) {
		
		if(st.size()==0) {
			st.push(val);
			return;
		}
		
		int topElement= st.pop();
		InsertAtBottom(st, val);
		st.push(topElement);
		
		
	}
	
	public static void Reverse(Stack<Integer> st) {
		
		if(st.size()==0) {
			return;
		}
		
		int topElement= st.pop();
		Reverse(st);
		InsertAtBottom(st, topElement);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st= new Stack();
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		System.out.println(st);
//		InsertAtBottom(st, 5);
//		System.out.println(st);
		Reverse(st);
		System.out.println(st);
		
		
		
		
	}

}
