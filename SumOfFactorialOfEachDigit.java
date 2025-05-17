import java.util.Scanner;
class  SumOfFactorialOfEachDigit
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter number:");
		int n=sc.nextInt();

		int sum=0;
		while (n!=0)
		{
			int ld=n%10;
		
		int product=1;
		for (int i=1;i<=ld;i++)
				{
				product=product*i;
				}
		
		sum=sum+product;
		n=n/10;
		}
		System.out.println(sum);

		
	}
}
