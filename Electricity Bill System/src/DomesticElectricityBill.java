
public class DomesticElectricityBill {
	
	int consumerNo;
	String consumerName;
	double prevReading;
	double currentReading;
	String connectionType;
	
 public DomesticElectricityBill(int consumerNo, String consumerName, double prevReading, double currentReading,
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
	       
	 if (connectionType.equalsIgnoreCase("domestic")) {
		  
	 if (unitsConsumed <= 100) {
		  amount = unitsConsumed * 1;
}
	 else if (unitsConsumed <= 200) {
		  amount = (100 * 1) + ((unitsConsumed - 100) * 2.50);
}
	 else if (unitsConsumed <= 500) {
		 amount = (100 * 1) + (100 * 2.50) + ((unitsConsumed - 200) * 4 );
}
	 else {
		 
		 amount = (100 * 1) + (100 * 2.50) + (300 * 4) + ((unitsConsumed - 500) * 6);
}      
		 System.out.println("Invalid connection type for domestic calculation.");
}
	      return amount;
 }
 }
	


