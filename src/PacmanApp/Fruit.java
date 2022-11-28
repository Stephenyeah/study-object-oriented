package PacmanApp;

class Fruit 
{
	
	public boolean isVisible;
	
	public Fruit()
	{
		this.isVisible  = true;
	}
	public void disappear()
	{
		isVisible =false;
		System.out.println("Fruit is hidden");
	}
	
	

}
