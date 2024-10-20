package Java22;

public class FibonacciSeries1To10 {

	public static void main(String[] args) {
		
		int firstnum=1;
		int secondnum=2;
		
		for(int i=1; i<=10; i++)
		{
			System.out.print(firstnum+",");
			int temp=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=temp;
		}
	}
}
