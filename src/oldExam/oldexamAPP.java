package oldExam;

public class oldexamAPP {
	public static void main(String[] args)
	{
		Dishwasher dishwasher1 = new Dishwasher(3,true);
		dishwasher1.setProgramme(3);
		dishwasher1.turnOnOff();
		System.out.println(dishwasher1.isOn());
		
		
	}

}
