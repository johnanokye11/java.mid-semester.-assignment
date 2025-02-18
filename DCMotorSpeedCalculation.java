import java.util.Scanner;

public class DCMotorSpeedCalculation {

	public static void main(String[] args) {
	
		// Create a Scanner object to read input from the console. 
		
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the input Voltage (in Volts)
		
        System.out.print("Enter the input Voltage (in Volts): ");
        double voltage = scanner.nextDouble();

        // Prompt the user to enter the Back EMF (in Volts)
        
        System.out.print("Enter the Back EMF (in Volts): ");
        double backEMF = scanner.nextDouble();

        // Prompt the user to enter the Motor Constant (assumed unit: V/(rad/s))
        
        System.out.print("Enter the Motor Constant (in V/(rad/s)): ");
        double motorConstant = scanner.nextDouble();

        // Validate inputs:
        // 1. Ensure that voltage and backEMF are not negative.
        
        if (voltage < 0) {
            System.out.println("Error: Voltage cannot be negative.");
            return;
            
            // Exit the program if the input is invalid.
  }
        
        if (backEMF < 0) {
            System.out.println("Error: Back EMF cannot be negative.");
            return;
  }
        // 2. Motor constant must be positive and non-zero to avoid division by zero.
        
        if (motorConstant <= 0) {
            System.out.println("Error: Motor Constant must be greater than zero.");
            return;
  }
        // Optionally, you may also ensure that the voltage is at least as high as the back EMF.
        
        if (voltage < backEMF) {
            System.out.println("Error: Voltage must be greater than or equal to Back EMF.");
            return;
        }

        // Calculate the speed in rad/s using the formula:
        // speed (rad/s) = (Voltage - Back EMF) / Motor Constant
        
        double speedRadPerSec = (voltage - backEMF) / motorConstant;

        // Convert the speed from rad/s to RPM.
        // Note: 1 revolution = 2π radians, and 1 minute = 60 seconds.
        // Thus, RPM = (rad/s) * (60 / (2 * π))
        
        double speedRPM = speedRadPerSec * (60 / (2 * Math.PI));

        // Display the result formatted to two decimal places.
        
        System.out.printf("The calculated speed of the DC motor is: %.2f RPM\n", speedRPM);
	
}
 }


