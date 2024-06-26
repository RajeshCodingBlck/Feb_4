package OOPs;

public class AC {
     
	// State
	int temp;
	boolean fanMode;
	int speedOfFan;
	
	
	  // Default Constructor.
//	 AC(){}
//	 
	 AC(int temp, boolean fanMode, int speedOfFan){
			this.temp=temp;
			this.fanMode=fanMode;
			this.speedOfFan=speedOfFan;
	}
	// Behaviour
	public void TempInc() {
		this.temp= temp+1;
	}
	public void Tempdec() {
		this.temp=temp-1;
	}
	
}
