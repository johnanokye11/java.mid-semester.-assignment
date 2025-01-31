package main;

import converters.currency.CurrencyConverter;

import converters.distance.DistanceConverter;

import converters.time.TimeConverter;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		DistanceConverter distanceConverter = new DistanceConverter();
		
		TimeConverter timeConverter = new TimeConverter();
		
		while (true) {
			System.out.println("\n--- Converter Application ---");
			
			System.out.println("1: Currency Converter\n2: Distance Converter\n3: Time Converter\n4: Exit");
			
			System.out.print("Choose an option: ");
		
	           int choice = scanner.nextInt();    
	      
	       switch (choice) {
	          case 1 -> currencyConverter.ConvertCurrency();
		  	  
		  	  case 2 -> distanceConverter.convertDistance();
		  	  
		  	  case 3 -> timeConverter.convertTime();
		  	  
		  	  case 4 -> {
		  		  System.out.println("Exiting...");
		  		    scanner.close();
		  		      return;
}
		  	  
		  	         default -> System.out.println("Invalid choice! Try again.");
}
		        if (choice >= 1 && choice <= 4) {
		 	    		 	    	
}	       

}

}
}