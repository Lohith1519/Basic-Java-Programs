
//Factorial of the numbers also 
import java.util.Scanner;
class ProductOfIntegers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		int product=1;
		for (int i=1;i<=n ;i++ )
		{
			product*=i;
		}
		System.out.println("Product of the numbers is: "+product);
	}
}
