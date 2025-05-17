import java.util.Scanner;
class  AgeCategory
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("========================= ");
		System.out.println("Age Calculator");
		System.out.println("=========================");

		System.out.println("Enter age :");
		int age=sc.nextInt();
		
		if(age>=0&&age<=2)
		{
			System.out.println("you come under babies category");
		}
		else if(age<=3&&age<=12)
		{
			System.out.println("you come under kids category");
		}
		else if(age<=13&&age<=19)
		{
			System.out.println("you come under teengers category");
		}
		else if(age<=20&&age<=30)
		{
			System.out.println("you come under adults category");
		}
		else if(age<=31&&age<=50)
		{
			System.out.println("you come under middleage category");
		}
		else if(age<=51&&age<=100)
		{
			System.out.println("you come under Senior citizen category");
		}
		else
		{
			System.out.println("Enter valid age");
		}
		

	}
}

