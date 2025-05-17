import java.util.Scanner;
class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("===========================================");
		System.out.println("Simple Interest");
		System.out.println("===========================================");
		
		System.out.println("Enter Principle");
		double p=sc.nextDouble();
		
		System.out.println("Enter rate of Interest");
		double r=sc.nextDouble();
		
		System.out.println("Enter time");
		double t=sc.nextDouble();

		System.out.println("===========================================");
		System.out.println("Simple Interest s: " +((p*r*t)/100));
		System.out.println("===========================================");
	
	}
}

