package Toyclass;



class RemoteCar extends Toy{
	private String frequency;
	private String carName;
	

	public  RemoteCar() {
		
	}
	
	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public void chosecar(String name) {
		this.carName = name;
	}
	public void printData() {
		System.out.println("Frequency:"+frequency);
		System.out.println("Carname:"+carName);
	}

	
}