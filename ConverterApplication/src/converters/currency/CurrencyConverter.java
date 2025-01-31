package converters.currency;

import java.util.Scanner;

public class CurrencyConverter{
	
	private static final double USD_TO_GHS = 12.5;
	
	private static final double EURO_TO_GHS = 13.2;
	
	private static final double YEN_TO_GHS = 0.089;
	
 public void ConvertCurrency() {
	 try (Scanner scanner = new Scanner(System.in)){
	
	System.out.println("Currency Conversion:");
	
	System.out.println("1: USD to GHS\n2: GHS USD\n3: EURO to GHS\n4: GHS to EURO\n5: YEN to GHS\n6: GHS to YEN");
	
	System.out.print("Choose an option: ");
	
	   int choice = scanner.nextInt();
	   
	   System.out.print("Enter amount: ");
	      double amount = scanner.nextDouble();
	       double result = 0;
	       
	  switch (choice) {
	  
	  case 1 -> result = amount * USD_TO_GHS;
	  
	  case 2 -> result = amount / USD_TO_GHS;
	  
	  case 3 -> result = amount * EURO_TO_GHS;
	  
	  case 4 -> result = amount / EURO_TO_GHS;
	  
	  case 5 -> result = amount * YEN_TO_GHS;
	  
	  case 6 -> result = amount / YEN_TO_GHS;
	  
	         default -> System.out.println("Invalid choice!");
 }
	    if (choice >= 1 && choice <= 6) {
	    	
	    	System.out.println("Converted Amount:" + result);
}
	   
}
		
}
}