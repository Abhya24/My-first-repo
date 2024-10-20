package Java;

public class FindUpperLowerCaseLetter {

	public static void main(String[] args) {
		String upper="";
		String lower="";
		
		String name="AbHIjeetWELcomE";
		System.out.println("Lenght of string = "+name.length());
		for(int i=0; i<name.length(); i++)
		{
			char letter = name.charAt(i);
			if(letter>='A' && letter<='Z')
			{
				upper=upper+letter;
			}
			else
			{
				lower=lower+letter;
			}
		}
		System.out.println("Upper case letters = "+upper);
		System.out.println("Lower case letters = "+lower);
	}
}
