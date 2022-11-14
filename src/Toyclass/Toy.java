package Toyclass;

class Toy {
	public String toyname;
	public double toyweight;
	
	public Toy()
	{
		toyname = "";
		toyweight = 0 ;
				
	}
	public Toy(String name)
	{
		toyname = name;
		toyweight = 0 ;
				
	}
	public Toy(String name,double weight)
	{
		toyname = name;
		toyweight= weight;
		
	}
	public void printDate()
	{
		System.out.println("Toy:"+toyname);
		System.out.println("Weight: "+ toyweight+" kg.");

	}
	 
		
}

