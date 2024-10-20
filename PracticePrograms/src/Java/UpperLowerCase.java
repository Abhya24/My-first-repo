package Java;

public class UpperLowerCase {

	public static void main(String[] args) {
		
		int upperCount=0;
		int lowerCount=0;
		String upper="";
		String lower="";
		
		String name="AbHiJeetWeLCOme";
		System.out.println("Lenght of string = "+name.length());
		for(int i=0; i<name.length(); i++)
		{
			char letter = name.charAt(i);
			if(letter>='A' && letter<='Z')
			{
				upperCount++;
				upper=upper+letter;
			}else
			{
				lowerCount++;
				lower=lower+letter;
			}
		}
		System.out.println("Upper case letters counts are = "+upperCount);
		System.out.println("Lower case letters counts are = "+lowerCount);
		System.out.println("Upper case letters are = "+upper);
		System.out.println("Lower case letters are = "+lower);
	}
}
