package Stack;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyStack st= new MyStack(5);
      st.push(45);
      st.push(56);
      st.push(67);
      st.push(78);
      st.push(78);
      st.push(78);
      System.out.println(st.size());
      System.out.println(st.peek());
      st.pop();
      System.out.println(st.peek());
      st.pop();
      System.out.println(st.peek());
      
      int [] arr= new int [5];
      System.out.println(arr[6]);
      
	}

}
