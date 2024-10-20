
public class Matrix3by3 {

	public static void main(String[] args) {
		 int[][] matrix = new int[3][3];
	        
	        // Populate the matrix with values
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                // You can replace the values in the matrix as needed
	                matrix[i][j] = i * 3 + j + 1;
	            }
	        }
	        
	        // Print the matrix
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println(); // Move to the next row
	        }
	}
}
