package Toyclass;
import java.util.Scanner;

public class toyApp {

	public static void main(String[] args)
	{
		lightSaber toy1 = new lightSaber();
		toy1.chooselightSaber();
		toy1.printData();
		
	}

}

class lightSaber extends Toy {
	private String type;
	private String color;
	public lightSaber () 
	{
		type = "";
		color = "";
	}
	public lightSaber (String type, String color) 
	{
							
		this.type = type;
		
			
		this.color = color;
		
	}
    public void chooselightSaber() {
    	Scanner in = new Scanner(System.in);
      System.out.println("Shoto-type=s |"+" Standard=t |"+" Lightsaber pistol=l |"+" Double-bladed =d |"+" Curved-hilt =c |"+" Crossguard =x");
      String chose = in.nextLine();
      if(chose.equals("s")) {
    	  this.type = "Shoto-type";    	  
      }
      else if(chose.equals("t")) {
    	  this.type = "Standard";    	  
      }
      else if(chose.equals("l")) {
    	  this.type = "Lightsaber pistol";    	  
      }
      else if(chose.equals("d")) {
    	  this.type = "Double-bladed";    	  
      }
      else if(chose.equals("c")) {
    	  this.type = "Curved-hilt";    	  
      }
      else if(chose.equals("x")) {
    	  this.type = "Crossguard";    	  
      }
      System.out.println("Please write the color you like: ");
      String chosecolor = in.nextLine();
      this.color= chosecolor;
            
    }
    public void printData() {
    	System.out.println("LightSaber: "+this.type+" LightSaber.");
		System.out.println("Color of LightSaber: "+ color);
    }
    
}
class Toy {
	public String toyname;
	public double toyweight;
	public int suitableage;
	public double price;
	
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
