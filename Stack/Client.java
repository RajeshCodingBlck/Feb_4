package Stack;

public class Client {

	public static void main(String[] args)  throws Exception  { 
		// TODO Auto-generated method stub
      MyStack st= new MyStack(5);
      
//      st.push(45);
//      st.push(56);
//      st.push(67);
//      st.push(78);
//      st.push(78);
//      st.push(78);
      
       try {
    	      st.push(45);
    	      st.push(56);
    	      st.push(67);
    	      st.push(78);
    	      st.push(78);
    	      st.push(78);
    	      
    	      System.out.println("heelo");
    	   
       }catch(Exception e) {
    	   
    	  System.out.println("try 1"); 
       }
//       
//       try {
//    	   
//    	  st.push(45);
// 	      st.push(56);
// 	      st.push(67);
// 	      st.push(78);
// 	      st.push(78);
// 	      st.push(78);
// 	      
//       }catch (Exception e) {
//    	   
//    	   System.out.println("try 2");
//    	   
//       }
      System.out.println(st.size());
      System.out.println(st.peek());
      st.pop();
      System.out.println(st.peek());
      st.pop();
       //throw new Exception("Main Exception");
      System.out.println(st.peek());
//      int [] arr= new int [5];
//      System.out.println(arr[6]);
      
	}

}
