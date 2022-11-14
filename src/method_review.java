import java.util.Scanner;

public class method_review {
	
		  static void humanprintFeverLimits(){
			  System.out.println("Fever limits");
			  System.out.println("-human "+37);
			  System.out.println("-dog "+39);
			  System.out.println("-horse "+38);
			  
			  
		  }
		  static void hasFever(String subject,int temp){
			  
			  if(subject.equals("human")) {
					  if( temp>37) {
				  System.out.println("the subject has fever.");
					  }
					  else {
						  System.out.println("The subject has no fever");
					  }
			  }
			  if(subject.equals("dog")) {
				  if( temp>38) {
					  System.out.println("the subject has fever.");
						  }
				  else {
					  System.out.println("The subject has no fever");
				  }
				  }
			  if(subject.equals("horse")) {
				  if( temp>40) {
					  System.out.println("the subject has fever.");
						  }
				  else {
					  System.out.println("The subject has no fever");
				  }
				  }
		  }

		  
		  public static void main(String[] args) {
			  humanprintFeverLimits();
			  
			  Scanner in = new Scanner(System.in);
			  Scanner sub = new Scanner(System.in);
			  
			  System.out.println("Subject:");
			  String subject = sub.nextLine();
			  System.out.println("Temperature:");			  
			  int temp = Integer.valueOf(in.nextInt());
			
			  hasFever(subject,temp);
			  			  
			  
		  }
			
		
}
