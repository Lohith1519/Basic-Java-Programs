import java.util.Scanner;
class  Seasons
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter a month number :");
		int m=sc.nextInt();

		if (m==3||m==4||m==5)
		{
			System.out.println("Summer season");
		}
		else if (m==6||m==7||m==8)
		{
			System.out.println("Rainy season");
		}
		else if (m==9||m==10||m==11)
		{
			System.out.println("Spring season");
		}
		else if (m==12||m==1||m==2)
		{
			System.out.println("Winter season");
		}
		else 
		{
			System.out.println("Enter valid value");
		}
	}
}
		
