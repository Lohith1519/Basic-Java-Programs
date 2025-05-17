import java.util.Scanner;
class  EligibityForIAS
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=sc.nextInt();

		if((age>=21) && (age<=32))

		{                                 
			System.out.println("Eligible for IAS");
		}

		else
		{
			System.out.println("Not Eligible for IAS");
		}
	}
}