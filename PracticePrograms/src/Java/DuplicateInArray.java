package Java;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		String name[]= {"java","python","java","c++","python","java"};
		System.out.println("Lenght of string is = "+name.length);
		
		for(int i=0; i<name.length; i++)
		{
			for(int j=1+i; j<name.length; j++)
			{
				if(name[i]==name[j])
				{
					System.out.println(name[j]);
				}
			}
		}
	}
}
