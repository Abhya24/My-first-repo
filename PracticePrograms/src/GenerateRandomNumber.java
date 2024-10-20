import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		Random randomnum= new Random();
		int ranNum = randomnum.nextInt(10);
		System.out.println(ranNum);
	}
}
