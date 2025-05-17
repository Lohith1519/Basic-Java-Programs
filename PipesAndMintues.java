import java.util.Scanner;
class  PipesAndMintues
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter time taken by pipes A");
		int n=sc.nextInt();
		System.out.println("Enter time taken by pipes B");
		int m=sc.nextInt();
		System.out.println("Time taken by both pipes A and B is : "+((n*m)/(n+m)));
		
	}
}
