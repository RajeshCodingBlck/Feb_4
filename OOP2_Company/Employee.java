package OOP2_Company;

public abstract class Employee {

	
	String Name;
	int Salary;
	int ID;
	
	Employee(String Name, int ID, int Salary){
		
		this.Name=Name;
		this.ID=ID;
		this.Salary=Salary;
	}
	
	public abstract void Introduction();
}
