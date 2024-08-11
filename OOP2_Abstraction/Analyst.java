package OOP2_Abstraction;

public class Analyst {

	String Name;
	int Salary;
	int ID;
	
	Analyst(String Name, int ID, int Salary){
		
		this.Name=Name;
		this.ID=ID;
		this.Salary=Salary;
	}
	
	public void Introduction() {
		System.out.println("I am a Analyst  "+ Name);
	}
}
