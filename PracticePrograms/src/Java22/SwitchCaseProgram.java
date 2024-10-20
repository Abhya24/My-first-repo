package Java22;

import java.util.Scanner;

import org.apache.poi.ss.formula.atp.Switch;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		String dayName="";
		
		switch (num){
		case 1 : dayName="Sunday"; break;
		case 2 : dayName="Monday"; break;
		case 3 : dayName="Tuesday"; break;
		case 4 : dayName="Wednesday"; break;
		case 5 : dayName="Thrusday"; break;
		case 6 : dayName="Friday"; break;
		case 7 : dayName="Saturday"; break;
		}
		System.out.println("Selected Day is = "+dayName);
	}

}
