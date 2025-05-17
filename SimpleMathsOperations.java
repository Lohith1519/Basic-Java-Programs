import java.util.Scanner;
class  SimpleMathsOperations
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("========================= ");
		System.out.println("Simple Calculator");
		System.out.println("=========================");

		double a=sc.nextDouble();
		char op=sc.next().charAt(0);
		double b=sc.nextDouble();

		if(op=='+')
		{
			System.out.println(a+b);
		}
		else if(op=='-')
		{
			System.out.println(a-b);
		}
		else if(op=='*')
		{
			System.out.println(a*b);
		}
		else if(op=='/')
		{
			System.out.println(a/b);
		}
		else if(op=='%')
		{
			System.out.println(a%b);
		}
		else
		{
			System.out.println("Enter valid operator");
		}
		

	}
}
