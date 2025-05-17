import java.util.Scanner;
class  GradeResult
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your Grade ");
		char grade=sc.next().charAt(0);
		if(grade=='A'||grade=='a')
		{
			System.out.println(" You got First Rank");
		}
		else if(grade=='B'||grade=='b')
		{
			System.out.println( " You got second Rank");
		}
		else if(grade=='C'||grade=='c')
		{
			System.out.println( " you got first class");
		}
		else if(grade=='D'||grade=='d')
		{
			System.out.println( " you got second class");
		}
		else if(grade=='E'||grade=='e')
		{
			System.out.println( " you got passed the exam");
		}
		else if(grade=='F'||grade=='f')
		{
			System.out.println( " you failed the exam");
		}
		else 
		{
			System.out.println( " Enter valid input");
		}

	}
}
