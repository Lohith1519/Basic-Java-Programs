import java.util.Scanner;
class  BillAmount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("===========================================");
		System.out.println("Kumari Aunty's Kitchen");
		System.out.println("===========================================");
		
		System.out.println("Enter Price ");
		double p=sc.nextDouble();

		System.out.println(" 18% CGST : "+0.18*p);
		
		System.out.println(" 18% SGST : "+0.18*p);
		
	
		System.out.println("===========================================");
		System.out.println("Bill Amount b : " +(p+0.36*p));
		System.out.println("===========================================");

		System.out.println("===========================================");
		System.out.println("Thank you");
		System.out.println("===========================================");
		
	
	}
}
