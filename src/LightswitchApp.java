
public class LightswitchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
  

}
class LightSwitch
{
	public boolean lightOn;
	
	
	public void printInfo() {
		if(lightOn == true)
		{
			System.out.println("Lights are on.");
		}
		if(lightOn == false)
		{
			System.out.println("Lights are off.");
		}
	}
	
	
}

class Dimmer extends LightSwitch
{
	private int brightness ;

   public void setBrightness(int b)
   {
	   this.brightness = b;
	   if(b==0)
	   {
		this.lightOn = false;   
	   }
	   else
	   {
		   this.lightOn = true;
	   }
   }
   @Override
   public void printInfo()
   {
		if(lightOn == false)
		{
			System.out.println("Lights are off.");
		}
		else {
	   System.out.println("Brightness is "+this.brightness+".");
		}
   }
     
	
	
}
