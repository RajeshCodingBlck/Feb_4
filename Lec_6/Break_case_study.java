package Lec_6;

public class Break_case_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	  for(int i=1; i<=3;i++) {
		  
		  for(int j=1; j<=4;j++) {
			  
			  if(j==3) {
				  break;
			  }else {
				  System.out.println(j);
			  }
		  }
		  
		  System.out.println();
	  }
	}

}
