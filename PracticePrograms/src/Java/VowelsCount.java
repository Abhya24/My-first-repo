package Java;

public class VowelsCount {

	public static void main(String[] args) {
		int vowelsCount=0;
		String vowels="";
		String name="AbHijEeTUIo";
		System.out.println("Lenght of string = "+name.length());
		name=name.toUpperCase();
		for(int i=0; i<name.length(); i++)
		{
			char letter = name.charAt(i);
			if(letter=='A' || letter=='E' ||	letter=='I' || letter=='O' ||	letter=='U' )
			{
				vowelsCount++;
				vowels=vowels+letter;
			}
		}
		System.out.println("Vowels count are = "+vowelsCount);
		System.out.println("Vowels are = "+vowels);
	}
}
