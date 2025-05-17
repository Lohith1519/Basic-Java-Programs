//WAPTP sum of even digits and product of odd digits in a given number

import java.util.Scanner;
class  SumOfEvenAndProductOfOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();

		int x=num;

		int sum=0;
		int prod=1;

		while (x!=0)
		{
			int ld=x%10;
			if (ld%2==0)
			{
				sum=sum+ld;
			}
			else
			{
				prod=prod*ld;
			}
			x=x/10;
		}

		System.out.println("Even digits sum in a given number is :" +sum);
		System.out.println("Odd digits product in a given number is :" +prod);
	}
}