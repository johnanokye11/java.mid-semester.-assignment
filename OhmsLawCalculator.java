import java.util.Scanner;

public class OhmsLawCalculator {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

		        // Prompt the user for the unknown parameter
	
    System.out.println("Which parameter do you want to calculate? (Voltage, Current, Resistance)");
    
		  String choice = scanner.nextLine().trim().toLowerCase();

		  double voltage = 0, current = 0, resistance = 0;

		        // Calculate the missing parameter based on the user's choice
		        
		  switch (choice) {
		    case "voltage":
		       System.out.print("Enter Current (A): ");
		       current = scanner.nextDouble();
		       System.out.print("Enter Resistance (Ω): ");
		       resistance = scanner.nextDouble();
		       voltage = current * resistance;  // V = I * R
		       System.out.println("Calculated Voltage: " + voltage + " V");
		             break;

		      case "current":
		    	  
		        System.out.print("Enter Voltage (V): ");
		        voltage = scanner.nextDouble();
		        System.out.print("Enter Resistance (Ω): ");
		        resistance = scanner.nextDouble();
		        current = voltage / resistance;  // I = V / R
		        System.out.println("Calculated Current: " + current + " A");
		        
		              break;
		              
		        case "resistance":
		        	
		         System.out.print("Enter Voltage (V): ");
		         voltage = scanner.nextDouble();
		         System.out.print("Enter Current (A): ");
		         current = scanner.nextDouble();
		         resistance = voltage / current;  // R = V / I
		         System.out.println("Calculated Resistance: " + resistance + " Ω");
		         
		             break;

		            default:
		            	
		        System.out.println("Invalid choice! Please enter Voltage, Current, or Resistance.");
		        }

		        scanner.close();
		    }
		}


	
