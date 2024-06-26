package OOPs1_2;

class Bank{
	
	private int balance;
	public int pin_number;
	Bank(int amount, int pin_number){
		
		this.balance=amount;
		this.pin_number=pin_number;
	}
	
	public void getter(int pin_number) {
	 
		if(this.pin_number== pin_number) {
			 System.out.println(balance);
		}else {
			System.out.println("chal Nikal");
		}
	}
	
	public void setter(int amount) {
		if(amount>0) {
			balance=amount;
		}else {
			
			System.out.println("Given Amount is in valid");
		}
		
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Bank yesbank= new Bank(123, 222);
//		System.out.println(yesbank.balance);
//		yesbank.balance=0;
//		System.out.println(yesbank.balance);
		
		yesbank.getter(222);
		yesbank.setter(345);
		yesbank.getter(221);
	   
	}

}
