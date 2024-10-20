package Java;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		String arr[]= {"ram","kam","jam","kam","can","jam","ram"};
		System.out.println("lenght of string array = "+arr.length);
		System.out.println("Duplicate values are below ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
