import java.util.Scanner;
class  GiftShop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("Welcome to Gift Shop");
		System.out.println("==================================");

		System.out.println("Enter the bill :");
		double bill=sc.nextDouble();
		
		System.out.println("==================================");
		System.out.println("You are Eligible for 10% discount");
		bill=0.9*bill;
		System.out.println("==================================");

		System.out.println("==================================");
		System.out.println("Are you a regular customer here");
		System.out.println("Enter true if yes,otherwise false");
		System.out.println("==================================");
		
		System.out.println("Enter here : ");
		boolean choice=sc.nextBoolean();

		if(choice==true)
		{   
			
			System.out.println("Enter 4 digit code");
			int code=sc.nextInt();

			if (code==1234)
			{
				System.out.println("Code Accepted");
				System.out.println("You are Eligible for extra 10% discount");
				System.out.println("Your Final Bill : "+0.9*bill);
			}
			else
			{
				System.out.println("You Cheater");
				System.out.println("Your Final Bill : "+bill);

			}
		}
		else
		{
			System.out.println(" Your Final Bill : "+bill);
			
		}

		System.out.println("==================================");
		System.out.println("Thank You .....Visit Again");
		System.out.println("==================================");
	}
}

