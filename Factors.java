]
import java.util.Scanner;
class  Factors
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number");
		int n=sc.nextInt();

        System.out.println("factors of :"+n);
		
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
		{
			System.out.println(i);
		}

		}


	}
}
