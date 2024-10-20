package Java;

public class RevesreStringLetters {

	public static void main(String[] args) {
		
		String reverse="";
		String name="mNbvCxZ";
		name=name.toUpperCase();
		
		System.out.println("Lenght of string = "+name.length());
		
		for(int i=name.length()-1; i>=0; i--)
		{
			char letter = name.charAt(i);
			reverse=reverse+letter;
		}
		System.out.println("Reverse string are = "+reverse);
	}
}
