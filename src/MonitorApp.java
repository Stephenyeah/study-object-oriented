import java.util.Scanner;

public class MonitorApp {
	public static void main(String[] args) 
	{
		touchMonitor touchmonitor1 = new touchMonitor("LG");
		
		Scanner in = new  Scanner(System.in);
		int x,y;
		
		System.out.println("X:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("X:");
		y = Integer.parseInt(in.nextLine());
		
		touchmonitor1.setTouchXY(x,y);
		
		touchmonitor1.printDate();
	}
}
	
	// Classes go there
class Monitor extends Device{
		protected boolean isOn;
		public String brand;
		
		//default constructor
		public Monitor()
		{
			brand = "";
			isOn =false;
			price = 0;
		}
		
		//parameterized constructor
		public Monitor(String brandName)
		{
			isOn = false;
			brand = brandName;
		}
		
		//Parameterized constructor
		public Monitor(String brandName, boolean isMonitorOn)
		{
			brand = brandName;
			isOn = isMonitorOn;
		}
		
		public void start() 
		{
			isOn = true;
		}
		public void shutdown() 
		{
			isOn = false;
		}
		public void printDate()
		{
			System.out.println("Monitor");
			System.out.println("Brand: "+brand);
			if(isOn)
			{
				System.out.println("The monitor is on");				
			}
			else
			{
				System.out.println("The monitor is off");
			}
		}			
}
//end of Monitor CLASS
class touchMonitor extends Monitor{
	private int touchX,touchY;
	//defout construtor
	public touchMonitor(){
		isOn = false;
		brand = "";
		touchX = 0;
		touchY = 0;
	}
	public touchMonitor(String brand){
		isOn = false;
		this.brand = brand;
		touchX = 0;
		touchY = 0;
	}
	
	public void setTouchXY(int x, int y)
	{
		touchX = x;
		touchY =y;
		
	}
	@Override
	public void printDate() 
	{
        super.printDate();
		System.out.println("TouchX: "+touchX+" TouchY: "+touchY);
	}
}

