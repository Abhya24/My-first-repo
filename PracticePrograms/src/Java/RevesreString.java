package Java;

public class RevesreString {

	public static void main(String[] args) {
		String reserve="";
		String original="mnBvCXz";
		original=original.toUpperCase();
		System.out.println("Lenght of string = "+original.length());
		for(int i=original.length()-1; i>=0; i--)
		{
			char letter = original.charAt(i);
			reserve=reserve+letter;
		}
		System.out.println("Reverse string = "+reserve);
	}
}
