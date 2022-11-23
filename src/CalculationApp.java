import java.util.Scanner;

public class CalculationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new  Scanner(System.in);
		
		String choose;
		
			System.out.println("Calulate the area of a rectangle or a circle(r/c)");
	       choose = in.nextLine();
		if(choose.equals("c"))
		{
			System.out.println("Radius?");
			int r = Integer.parseInt(in.nextLine());
			System.out.println(Calculation.calcArea(r));
			
		}
		if(choose.equals("r"))
		{
			System.out.println("width?");
			int w = Integer.parseInt(in.nextLine());
			System.out.println("length?");
			int l = Integer.parseInt(in.nextLine());
			System.out.println(Calculation.calcArea(w,l));
			
		}


				
//		System.out.println(Calculation.calcArea(10,20));
//		System.out.println(Calculation.calcArea(10));

	}

}
class Calculation {

	final static float PI=3.14f;
	
	
	
	public Calculation()
	{
	
		
	}

	public static double calcArea(int width,int length)
	{
		int result = width * length;
		return result;
		
	}
	public static String calcArea(int radius)
	{
		float result = radius * radius * PI;		
		return String.format("%.2f", result).toString();
	}

}