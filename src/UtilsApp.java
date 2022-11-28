import java.util.Scanner;

public class UtilsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Width?");
		int width = in.nextInt();
		System.out.println("Length?");
		int length = in.nextInt();
		
		System.out.println("Area is "+Utils.areaCalc(width, length));
		


	}

}

class Utils{
	
	public static void printTitle()
	{
		System.out.println("*******");
		System.out.println("* OOP *");
		System.out.println("*******");
	}
	public static int areaCalc(int width, int length)
	{
		int area = width * length;
		return area;
		
	}
	
}
