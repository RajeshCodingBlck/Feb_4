
package Encapsulation;
import java.util.*;
public class Account {

	// State
	Scanner s= new Scanner(System.in);
	public int accountNumber;
	public String accountHolder;
	private int accountBalance;
	String accountpasswrod;
	
	
	Account(){
		
//		System.out.println("Enter the Name");
//		this.accountHolder= s.next();
//		System.out.println("Enter the Starting Balance");
//		this.accountBalance= s.nextInt();
//		System.out.println("Enter the  AccountNumber");
//		this.accountNumber= s.nextInt();
//		System.out.println("Enter the Account Password");
//		this.accountpasswrod=s.next();
	}
	
	// checkBalance
	public int checkBalance(String password) {
		
		if(this.accountpasswrod.equals(password)) {
			return this.accountBalance;
		}else {
			System.out.println("Chal Nikal");
			return 0;
		}
	}
	
	public void update(String old_password, String new_password) {
		
		if(this.accountpasswrod.equals(old_password)) {
			this.accountpasswrod=new_password;
		}else {
			System.out.println("Given password is wrong");
		}
	}
	
	
	
}