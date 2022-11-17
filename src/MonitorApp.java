import java.util.Scanner;

public class MonitorApp {
	public static void main(String[] args) 
	{
	   Monitor monitor1 = new Monitor("LG");
	   Monitor monitor2 = new Monitor("Samsung");
		
		Scanner in = new  Scanner(System.in);
		int x,y;
		
		System.out.println("X:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Y:");
		y = Integer.parseInt(in.nextLine());
		
		monitor1.setMonitorXY(x,y);
		
		monitor1.printDate();
		monitor2.printDate();
	}
}
	
	// Classes go there
class Monitor{
		protected boolean isOn;
		public String brand;
		private int monitorX, monitorY;
		
		//default constructor
		public Monitor()
		{
			brand = "";
			isOn =false;
			monitorX = 0;
			monitorY =0;
		}
		
		//parameterized constructor
		public Monitor(String brandName)
		{
			isOn = false;
			brand = brandName;
			monitorX = 0;
			monitorY = 0;
		}
		
		//Parameterized constructor
		public Monitor(String brandName, boolean isMonitorOn)
		{
			brand = brandName;
			isOn = isMonitorOn;
			
		}
		public void setMonitorXY(int x, int y)
		{
			monitorX = x;
			monitorY =y;
			
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
			System.out.println("MonitorX: "+monitorX+" MonitorY: "+monitorY);
		}			
}
//end of Monitor CLASS
//class touchMonitor extends Monitor{
//	private int touchX,touchY;
//	//defout construtor
//	public touchMonitor(){
//		isOn = false;
//		brand = "";
//		touchX = 0;
//		touchY = 0;
//	}
//	public touchMonitor(String brand){
//		isOn = false;
//		this.brand = brand;
//		touchX = 0;
//		touchY = 0;
//	}
//	
//	public void setTouchXY(int x, int y)
//	{
//		touchX = x;
//		touchY =y;
//		
//	}
//	@Override
//	public void printDate() 
//	{
//        super.printDate();
//		System.out.println("TouchX: "+touchX+" TouchY: "+touchY);
//	}
//}

