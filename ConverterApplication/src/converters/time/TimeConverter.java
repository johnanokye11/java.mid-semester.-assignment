package converters.time;

import java.util.Scanner;

public class TimeConverter {
  
	public void convertTime() {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Time Conversion:"); 
			
			System.out.println("1: Hours to Minutes\n2: Minutes to Hours\n3: Minutes to Seconds\n4: Seconds to Minutes");
				
			System.out.print("Choose an option: ");

			 int choice = scanner.nextInt();
			 
			   System.out.print("Enter time: ");
			   
			   double time = scanner.nextDouble();
			   double result = 0;
			   
			   switch (choice) {
			  
			  case 1 -> result = time * 60;
			  
			  case 2 -> result = time / 60;
			  
			  case 3 -> result = time * 60;
			  
			  case 4 -> result = time / 60;
			  
			         default -> System.out.println("Invalid choice!");
   }
			    if (choice >= 1 && choice <= 4) {
			    	
			    	System.out.println("Converted Time:" + result);
}
}	       
}
}
