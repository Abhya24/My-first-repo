package Java22;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp=0;
		int num=17;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
				break;
			}
		}
		if(temp==1)
		{
			System.out.println("Not prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
	}
}
