import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
     
	System.out.print("Enter Employee Name: ");
    String name = scanner.nextLine();
    
    System.out.println("Enter Employee ID: ");
    String id = scanner.nextLine();
    
    System.out.print("Enter Address: ");
    String address = scanner.nextLine();
    
    System.out.print("Enter Mail ID: ");
    String mailId = scanner.nextLine();
    
    System.out.print("Enter Mobile Number: ");
    long mobileNo = scanner .nextLong();
    
    System.out.print("Enter Basic Pay: ");
    double basicPay = scanner.nextDouble();
    
    System.out.print("Choose Designation: ");
   
    System.out.println("1.Programmer");
    
    System.out.println("2. AssistantProfessor");
    
    System.out.println("4.Professor");
    
    int choice = scanner.nextInt();
    
    switch (choice) {
     case 1:
    	 
    	 new Programmer(name, id, address, mailId, mobileNo, basicPay).generatePaySlip();
    	    break;
    	      
      case 2:
    	  
    	 new AssistantProfessor(name, id, address, mailId, mobileNo, basicPay).generatePaySlip();
	      break; 
	      
      case 3: 
    	   
    	   new AssistantProfessor(name, id, address, mailId, mobileNo, basicPay).generatePaySlip();
 	      break; 
 	      
       case 4:
    	   
    	   new Professor(name, id, address, mailId, mobileNo, basicPay).generatePaySlip();
 	         break;
 	      
 	           default:
 	        	   
 	     System.out.println("Invalid Choice");
    }
    
           scanner.close();
    	  
}
}