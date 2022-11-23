package PacmanApp;

public class Pacman {
	public int points;
	
	public Pacman()
	{
		points =0 ;
	}
	public void printDate()
	{
		System.out.println(points);
		
	}
	public void eat(Fruit eatenFruit)
	{
		System.out.println("Pac-Man ate fruit");
		eatenFruit.disappear();
	}

}

