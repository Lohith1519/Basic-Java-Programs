//WAPTP count of even digits and odd digits separately in a given number
//WAPTP sum of even digits and product of odd digits in a given number

import java.util.Scanner;
class  CountOfEvenAndOddDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();

		int x=num;

		int even=0;
		int odd=0;

		while (x!=0)
		{
			int ld=x%10;
			if (ld%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			x=x/10;
		}

		System.out.println("Even digits in a given number is :" +even);
		System.out.println("Odd digits in a given number is :" +odd);
	}
}
