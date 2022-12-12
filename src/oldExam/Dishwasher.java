package oldExam;

class Dishwasher {
	private int programme = 1;
	private boolean isOn;
	

	public boolean isOn() {
		return isOn;
	}
	
	public Dishwasher() {	
	   
		printDate();
	}	
	public Dishwasher(boolean isOn) {	
	   
		this.isOn = isOn;
		printDate();
	}
	public Dishwasher(int programme,boolean isOn) {	
		   
		this.programme = programme;
		this.isOn = isOn;
		printDate();
	}
	
	public void setProgramme(int programme) {
		this.programme = programme;
		
		if(programme == 1) {
			System.out.println("normal");
		}
		else if(programme == 2) {
			System.out.println("auto");
		}
		else if(programme == 3) {
			System.out.println("Intensive");
		}
		
	}

	public void turnOnOff() {
		if(isOn == true) {
			this.isOn = false;
			
		}
		else if(isOn == false) {
			this.isOn = true;
			
		}
			
	}
	private void printDate() {
		System.out.println("Is the dishwasher on: "+this.isOn);
		System.out.println("Programme: "+this.programme);
	}
	



}
