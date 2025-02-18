import java.util.Scanner;

public class ArrayRevsersal {

	public static void main(String[] args) {
		
  Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the number of elements
  
  System.out.print("Enter the number of elements in the array: ");
  
   int size = scanner.nextInt();
   // Read the array size

   int[] array = new int[size];
   // Declare an array of given size

        // Step 2: Get array elements from the user
   
   System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            
            // Read each element
        }

        // Step 3: Reverse the array
    reverseArray(array);

        // Step 4: Display the reversed array
        
    System.out.println("Reversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Method to reverse the array
	
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
        	
            // Swap elements at left and right indices
        	
       int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move indices towards the center
            
     left ++;
     right --;
 
}
  }
   }