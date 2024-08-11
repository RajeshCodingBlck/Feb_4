package OOP2_Abstraction;

import java.util.*;

public class Manager {

	ArrayList<SoftwareEngineer> arr_software;
	ArrayList<Analyst>arr_Analyst;
	
	//static int a=12;
	
	Manager(){
		arr_software= new ArrayList<>();
		arr_Analyst=  new ArrayList<>();
	}
	
	public void add(SoftwareEngineer e) {
		e.Introduction();
		arr_software.add(e);
	}
	
	public void add(Analyst e){
		e.Introduction();
		arr_Analyst.add(e);
	}
	
}
