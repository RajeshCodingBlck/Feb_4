package OOP2_Company;

public class AIEngineer extends Employee {

	AIEngineer(String Name, int ID, int Salary) {
		super(Name, ID, Salary);
		// TODO Auto-generated constructor stub
	}
	
	public void Introduction() {
		System.out.println("I am a AI Engineer "+ Name);
	}

}
