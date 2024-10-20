package JavaSelenium;

public class Pattern12345 {

	public static void main(String[] args) {
		
		 // Outer loop for rows
        for (int i = 5; i >= 1; i--) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
	}
}     // output
    // 12345
    // 1234
	// 123
	// 12
	// 1