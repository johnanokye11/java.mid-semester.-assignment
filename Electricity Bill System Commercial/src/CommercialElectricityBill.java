
public class CommercialElectricityBill {
	
	int consumerNo;
	String consumerName;
	double prevReading;
	double currentReading;
	String connectionType;
	
	// Constructor
	
public CommercialElectricityBill(int consumerNo, String consumerName, double prevReading, double currentReading,
			String connectionType) {
	
	this.consumerNo = consumerNo;
	this.consumerName = consumerName;
	this.prevReading = prevReading;
	this.currentReading = currentReading;
	this.connectionType = connectionType;
}
	 // Method to calculate bill

  public double calculateBill() {
	  double unitsConsumed = currentReading - prevReading;
	       double amount = 0.0;
	     
	      if (connectionType.equalsIgnoreCase("commercial")) {
	 		  
	     if (unitsConsumed <= 100) {
	    			  amount = unitsConsumed * 2;
}
	    else if (unitsConsumed <= 200) {
	    			  amount = (100 * 2) + ((unitsConsumed - 100) * 4.50);
}
	     else if (unitsConsumed <= 500) {
	    			 amount = (100 * 2) + (100 * 4.50) + ((unitsConsumed - 200) * 6 );
}
	     else {
	    			 
	    amount = (100 * 2) + (100 * 4.50) + (300 * 6) + ((unitsConsumed - 500) * 7);
}      
	    System.out.println("Invalid connection type for commercial calculation.");
}
	    		   return amount;
 }
 }
	
 


