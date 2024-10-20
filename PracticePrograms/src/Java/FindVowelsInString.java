package Java;

public class FindVowelsInString {

	public static void main(String[] args) {
		
		int vowelscount=0;
		String vowels="";
		String name="AbHijeetieo";
		name=name.toUpperCase();
		System.out.println("Lenght of string = "+name.length());
		for(int i=0; i<name.length(); i++)
		{
			char letter = name.charAt(i);
			if(letter=='A'|| 
					letter=='E'||
					letter=='I'||
					letter=='O'||
					letter=='U')
			{
				vowelscount++;
				vowels=vowels+letter;
			}
		}
		System.out.println("Total vowels are = "+vowels);
	}
}
