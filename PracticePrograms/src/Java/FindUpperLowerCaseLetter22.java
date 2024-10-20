package Java;

public class FindUpperLowerCaseLetter22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String upper="";
		String lower="";
		
		String name="WelcomeToPUNE";
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
		System.out.println("Upper case letters are => "+upper);
		System.out.println("Lower case letters are => "+lower);

	}

}
