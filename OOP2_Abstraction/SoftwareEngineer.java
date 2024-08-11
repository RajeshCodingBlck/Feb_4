package OOP2_Abstraction;

public class SoftwareEngineer {
	
	String Name;
	int Salary;
	int ID;
	
	SoftwareEngineer(String Name, int ID, int Salary){
		
		this.Name=Name;
		this.ID=ID;
		this.Salary=Salary;
	}
	
	public void Introduction() {
		System.out.println("I am a Software Engineer "+ Name);
	}
}
