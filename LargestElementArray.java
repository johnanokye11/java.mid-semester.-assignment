
public class LargestElementArray {

	public static void main(String[] args) {
	 
		
		// Declare and initialize an array
		
        int[] array = {13, 46, 8, 24, 57, 90, 35};

        // Initialize max variable with first element of array
        
        int max = array[0];

        // Iterate through the array to find the largest element
        
        for (int i = 1; i < array.length; i++) {
        	
            if (array[i] > max) {
            	
                max = array[i];
            }
        }

        // Print the largest element
        
        System.out.println( "Largest element in the array is " + max);  
}
}

