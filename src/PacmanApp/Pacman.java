package PacmanApp;

class Pacman {
	public int points;
	private int lives=3;
	
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
	public void  decreaseLives()
	{
		lives--;
		System.out.print("Pac-Man is eaten");
		
	}

}

