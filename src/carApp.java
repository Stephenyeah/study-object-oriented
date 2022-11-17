import java.util.Scanner;
public class carApp {
	public static void main(String[] args) {
	// object car1	
		
		Scanner in = new  Scanner(System.in);
		String answer;
		Car car = new Car("Toyota", "RAV4", 40);
		
	//	car1.refuel(20);
		do {			
			System.out.println("a=accelerate b=break x=exit");
			answer = in.nextLine();
			if(answer.equals("a"))
			{
				car.accelerate();
			}
			else if(answer.equals("b"))
			{
				car.brake();
			}			
			
		}while(!answer.equals("x"));
				
	//object car2	
//		Car car2 = new Car("Toyota","86",50);	
//		car2.setModel(null);
		
	}

}
//Classes go there
class Car{
	private String brand;
    private String model;
	private int amountOfFuel;

    public Car()
	{
		brand = "";
		model = "";
		amountOfFuel = 10;
		printData();
	}	
	public Car(String brandname,String carmodel,int fuelamount)
	{
		this.brand = brandname;
		this.model = carmodel;
		this.amountOfFuel = fuelamount;
		printData();
		
		
	}
	
	public void brake() 
	{
	    
	  System.out.println("Car is breaking");
	    
	}
	public void accelerate()
	{
		if(amountOfFuel >0) {
			System.out.println("Car is accelerating");
			amountOfFuel = amountOfFuel - 1;	
		}	
		else {
			System.out.println();
		}
	}

	public String getModel() 
	{		
		return model;
	}
	public void setModel(String carmodel) 
	{
		this.model =carmodel;
		
	}
	private void printData() 
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Fuel: "+amountOfFuel);
	}
		public void refuel(int addfuel) {
		int afterrefuel=0;


			afterrefuel = amountOfFuel+addfuel;
	
				System.out.println("Fuel in the tank: "+ amountOfFuel);
				System.out.println("Refuel: "+addfuel);
				System.out.println("Fuel in the tank after the refuel: "+afterrefuel);
			
			
		
	}
	

}
