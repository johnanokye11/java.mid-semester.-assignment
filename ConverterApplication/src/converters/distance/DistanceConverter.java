package converters.distance;

import java.util.Scanner;

public class DistanceConverter {
	
public void convertDistance() {
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Distance Conversion:"); 
		
		System.out.println("1: Meters to Kilometers\n2: Kilometers to meters\n3: Miles to Kilometers\n4: Kilometers to Miles");
			
		System.out.print("Choose an option: ");

		 int choice = scanner.nextInt();
		 
		   System.out.print("Enter distace: ");
		   
		   double distance = scanner.nextDouble();
		   double result = 0;
		   
		   switch (choice) {
		  
		  case 1 -> result = distance / 1000;
		  
		  case 2 -> result = distance * 1000;
		  
		  case 3 -> result = distance * 1.609;
		  
		  case 4 -> result = distance / 1.609;
		  
		         default -> System.out.println("Invalid choice!");
  }
		   if (choice >= 1 && choice <= 4) {
		    	
		    	System.out.println("Converted Distance:" + result);
}
}
}
}
