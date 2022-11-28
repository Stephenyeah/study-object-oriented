package PacmanApp;

public class PacManApp {
	public static void main(String[] args)
	{
		Pacman pacman = new Pacman();
				
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		Fruit fruit3 = new Fruit();
		
		Ghost ghost1 = new Ghost();
		
		
		pacman.eat(fruit2);
		
		System.out.println(fruit1.isVisible);
		System.out.println(fruit2.isVisible);
		System.out.println(fruit3.isVisible);
		
		ghost1.eatPacman(pacman);
		
		
	}

}


