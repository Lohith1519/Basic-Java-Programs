import java.util.Scanner;
class  Pension
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 0 for male , 1 for female");
		int gender=sc.nextInt();
		System.out.println("Enter age of the person");
		int age=sc.nextInt();

		if(gender==0)
		{
			if (age>=55)
			{
			System.out.println("Eligible for pension");
			}
			else
			{
			System.out.println(" Not Eligible for pension");
			}
		}

		if(gender==1)
		{
			if (age>=45)
			{
			System.out.println("Eligible for pension");
			}
			else
			{
			System.out.println(" Not Eligible for pension");
			}
		}

		
	}
}