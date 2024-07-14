package Stack_Question;

import java.util.Stack;

public class NextGreaterElementInRightHandside {

	public static int [] NGE(int [] arr) {
		
		int [] result= new int[arr.length];
		Stack<Integer> st= new Stack();
		
		for(int i=arr.length-1;i>=0; i--) {
			
			while( st.size()>0 && st.peek()< arr[i]) {
				st.pop();
			}
			
			if(st.size()==0) {
				result[i]=-1;
			}else {
				result[i]= st.peek();
			}
			
			st.push(arr[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {5,11,9,6,8,10};
		
		int [] result= NGE(arr);
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}

}
