package Java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anything");
		int num = sc.nextInt();
		
	//	int num=12;
		if(num%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
}
