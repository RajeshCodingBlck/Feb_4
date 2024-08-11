package OOP2_Company;

import java.util.ArrayList;

public class Manager {

	 ArrayList<Employee> arr;
	 
	 Manager(){
		 arr= new ArrayList();
	 }
	 
	 public void add(Employee e) {
		 e.Introduction();
		 arr.add(e);
	 }
	 
	 
}
