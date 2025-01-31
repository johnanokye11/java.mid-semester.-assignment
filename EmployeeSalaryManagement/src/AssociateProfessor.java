
public class AssociateProfessor extends Employee {
	
	double basicPay;

  public AssociateProfessor(String empName, String empId, String address, String mailId, long mobileNo, double basicPay){
		
	 super(empName, empId, address, mailId, mobileNo);
	 
	    this.basicPay = basicPay;  
}

  
  public void generatePaySlip() {
	   
	  	 double da = 0.97 * basicPay;
	  	
	     double hra = 0.10 * basicPay;
	  	
	  	 double pf = 0.12 * basicPay;
	  	
	  	 double StaffClubFun = 0.001 * basicPay;
	  	
	  	 double GrossSalary = basicPay + da + hra;
	  
	  	 double NetSalary = GrossSalary - pf + StaffClubFun;
	  	 
	  	 displayDetails();
	  	 
	  	   System.out.println("Basic Pay:" + basicPay);
	  	   
	  	   System.out.println("DA:" + da);
	  	   
	  	   System.out.println("HRA:" + hra);
	  	   
	  	   System.out.println("PF:" + pf);
	  	   
	  	   System.out.println("Staff Club Fund:" + StaffClubFun);
	  	   
	  	   System.out.println("Gross Salary:" + GrossSalary);
	  	   
	  	   System.out.println("Net Salary:" + NetSalary);
	  	  	 
}
}
