import java.util.Scanner;
class  BajajElectronics
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("Welcome to Bajaj Electronics");
		System.out.println("==================================");

		System.out.println("Enter the bill :");
		double bill=sc.nextDouble();

		if(bill>=25000)
		{   
			System.out.println("You are Eligible for 20% discount");
			System.out.println("Your Final Bill:"+0.8*bill);
			System.out.println("Congratulations you got the silver coin");
		}

		else

		{
			System.out.println("You are Eligible for 10% discount");
			System.out.println("Your Final Bill:"+0.9*bill);
		}

		System.out.println("==================================");
		System.out.println("Thank You .....Visit Again");
		System.out.println("==================================");
	}
}
