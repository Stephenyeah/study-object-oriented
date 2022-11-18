import java.util.Scanner;
public class carApp {
	public static void main(String[] args) {
	// object car1	
		

		Car car = new Car("Toyota", "RAV4", 60,120, "Z429JB");
		Car car1 = new Car("Toyota", "86", 40,160, "藤原豆腐店");
		
		car.printData();
		car1.printData();
		
		System.out.println(car1.speed);
		Car.printcarCount();
	//	car input;
//		Scanner in = new  Scanner(System.in);
//		String answer;
//		do {			
//			System.out.println("a=accelerate b=break x=exit");
//			answer = in.nextLine();
//			if(answer.equals("a"))
//			{
//				car.accelerate();
//			}
//			else if(answer.equals("b"))
//			{
//				car.brake();
//			}			
//			
//		}while(!answer.equals("x"));
				
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
	private String regplate;
	public double speed;
	private static int carCount;
	

    public Car()
	{
		brand = "";
		model = "";
		amountOfFuel = 10;
		regplate = "";
		speed=60;
		carCount ++;
		
	}	
	public Car(String brandname,String carmodel,int fuelamount,double carspeed, String carplate)
	{
		this.brand = brandname;
		this.model = carmodel;
		this.amountOfFuel = fuelamount;
		this.regplate = carplate;
		this.speed = carspeed;
		carCount++;		
		
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
	
	public static void printcarCount()
	{
		System.out.println("Count the car: "+carCount);
	}
	
	public void printData() 
	{
		System.out.println("Car ");
		System.out.println("Brand: "+brand);
		System.out.println("Register plate: "+regplate);
		System.out.println("Model: "+model);
		System.out.println("Fuel: "+amountOfFuel);
		System.out.println("Speed: "+speed);
		System.out.println("Count the car: "+carCount);
		System.out.println(" ");
	}
		public void refuel(int addfuel) {
		int afterrefuel=0;


			afterrefuel = amountOfFuel+addfuel;
	
				System.out.println("Fuel in the tank: "+ amountOfFuel);
				System.out.println("Refuel: "+addfuel);
				System.out.println("Fuel in the tank after the refuel: "+afterrefuel);
			
			
		
	}
	

}
