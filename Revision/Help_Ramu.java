import java.util.*;
public class Help_Ramu {
   
   public static int helper(int [] arr, int c1, int c2, int c3){

     int Cost=0;
	 for(int i=0; i<arr.length;i++){

		 int val1= arr[i]*c1;
		 int val2=c2;
		 Cost += Math.min(val1, val2);
	 }

	 return Math.min(Cost, c3);

   }
    public static void main(String args[]) {
    
	  Scanner s= new Scanner(System.in);
	  int t= s.nextInt();

	  while(t>0){

         int c1= s.nextInt(); // cost of Ticket1
		 int c2=s.nextInt(); // cost of Ticket2
		 int c3=s.nextInt();// cost of Ticket3
		 int c4=s.nextInt();// cost of Ticket4

		 int n=s.nextInt(); // No of Rickshaw
		 int m= s.nextInt(); // No of Cabs

		 int[] Rickshaw= new int[n];
		 int [] cabs= new int[m];
		 for(int i=0; i<n;i++){
			 Rickshaw[i]=s.nextInt();
		 }
		 for(int i=0; i<m;i++){
			 cabs[i]=s.nextInt();
		 }
         int Rickshaw_cost= helper(Rickshaw, c1, c2, c3);
		 int cabs_cost= helper(cabs, c1, c2,c3);

        int final_ans= Math.min(Rickshaw_cost+ cabs_cost, c4); 
        System.out.println(final_ans);

		  t--;
	  }
    }
}
