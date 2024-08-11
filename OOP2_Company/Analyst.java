package OOP2_Company;

public class Analyst extends Employee{

	Analyst(String Name, int ID, int Salary) {
		super(Name, ID, Salary);
		// TODO Auto-generated constructor stub
	}
	
	public void Introduction() {
		System.out.println("I am a Analyst Engineer"+ Name);
	}

}
