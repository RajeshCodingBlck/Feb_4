package OOP2_Abstraction;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//System.out.println(Manager.a);
		Manager Garv= new Manager();
		SoftwareEngineer Lakshay= new SoftwareEngineer("Lakshay", 123,100);
		Analyst  Bhavika = new Analyst("Bhavika", 124, 300);
		System.out.println(Lakshay.Salary);
		Garv.add(Bhavika);
		Garv.add(Lakshay);
		
		
	}

}
