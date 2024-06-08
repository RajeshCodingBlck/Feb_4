import java.util.*;
public class Majority_Element {
    public static void helper(int [] arr){
      
      Arrays.sort(arr);
      int fre=1;
      int count=0;
      int n= arr.length;
      for(int i=1; i<arr.length;i++){

          if(arr[i]==arr[i-1]){
              fre++;
          }else{
              if(fre > (n/3)){
                  System.out.print(arr[i-1]+" ");
                  count++;
              }
              fre=1;
          }
      }

      if(fre > (n/3)){
          System.out.print(arr[arr.length-1]);
          count++;

      }

      if(count==0){
          System.out.println("No Majority Elements");
      }


    }
    public static void main (String args[]) {
       
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();

       int [] arr= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }

        helper(arr);
    
    }
}