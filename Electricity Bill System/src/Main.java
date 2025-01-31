import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		// Taking input from user
		
	System.out.print("Enter user number: ");
	    int consumerNo = scanner.nextInt();
	      scanner.nextLine();
	      
	System.out.print("Enter Consumer Name: ");
	    String consumerName = scanner.nextLine();
	     
	      
	System.out.print("Enter Previous Month Reading: ");
	     double prevReading = scanner.nextDouble();
	     
	     
	System.out.print("Enter Current Month Reading: ");
	     double currentReading = scanner.nextDouble();
	     
	System.out.print("Enter Connection Type: ");
	     String connectionType = scanner.next();
	     
	     // Creating Object
	     
 DomesticElectricityBill bill = new DomesticElectricityBill(consumerNo, consumerName, prevReading, currentReading, connectionType);
    		 
        // Displaying the bill amount
  
System.out.println("\nDomestic Electricity Bill for Mr/Mrs " + consumerName + "(Consumer No:" + consumerNo +")");
 
      System.out.println("Units Consumed: " + (currentReading - prevReading ));
      
      System.out.println("Total Bill Amount: GH." + bill.calculateBill());
      
      scanner.close();
	}

}
