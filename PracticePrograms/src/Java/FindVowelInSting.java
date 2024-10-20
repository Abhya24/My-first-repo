package Java;

public class FindVowelInSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String vowels="";
		String name= "AbhIJeEtBhaOu";
		name=name.toUpperCase();
		
		System.out.println("Lenght of string = "+name.length());
		
		for(int i=0; i<name.length(); i++)
		{
			char letter = name.charAt(i);
			if(letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U')
			{
				vowels=vowels+letter;
			}
		}
		System.out.println("Vowels in string are => "+vowels);
	}

}
