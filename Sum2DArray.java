
public class Sum2DArray {

	public static void main(String[] args) {

		// Step 1: Define a 2D array with some sample integer elements.
		
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Step 2: Initialize a variable 'sum' to hold the total sum of the array elements.
        int sum = 0;

        // Step 3: Loop through each row of the 2D array.
        
        for (int i = 0; i < array.length; i++) {
        	
            // Step 4: Loop through each column (element) in the current row.
        	
            for (int j = 0; j < array[i].length; j++) {
            	
                // Step 5: Add the current element to the 'sum'.
                sum += array[i][j];
            }
        }

        // Step 6: Output the result to the console.
        
        System.out.println("The Sum of all the elements in the 2D array is: " + sum);	

}
 }


