package Revision;
import java.util.*;
public class Main {
    public static void main(String args[]) {
      
	   Scanner s= new Scanner(System.in);
	   int n= s.nextInt();
	   int [] arr= new int [n];
	   int totalSum=0;
	   for(int i=0; i<n;i++){
		   arr[i]=s.nextInt();
		   totalSum+=arr[i];
	   }

	   int q= s.nextInt();
       
	   int mod=(int)(1e9+7);
	   int ans= ((int)(Math.pow(2, q))*totalSum)%mod;
	   System.out.println(ans);
    }
}