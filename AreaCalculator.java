import java.util.Scanner;
class  AreaCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("========================= ");
		System.out.println("Welcome to Area Calculator");
		System.out.println("=========================");
		
		System.out.println("Enter 1 for circle area");
		System.out.println("Enter 2 for triangle area");
		System.out.println("Enter 3 for square area");
		System.out.println("Enter 4 for rectangle area");
		System.out.println("Enter 5 for rhombus area");
		int choice=sc.nextInt();
		

		if(choice==1)
		{
			System.out.println("You have selected circle to find its area");
			System.out.println("Enter radius of a circle");
			double r=sc.nextDouble();
			System.out.println("Area of a circle : "+3.14*r*r);
		}
		else if(choice==2)
		{
			System.out.println("You have selected triangle to find its area");
			System.out.println("Enter base of a triangle");
			double b=sc.nextDouble();
			System.out.println("Enter height of a triangle");
			double h=sc.nextDouble();
			System.out.println("Area of a trianglr : "+0.5*b*h);
		}
		else if(choice==3)
		{
			System.out.println("You have selected square to find its area");
			System.out.println("Enter side of a square");
			double s=sc.nextDouble();
			System.out.println("Area of a square : "+s*s);
		}
		else if(choice==4)
		{
			System.out.println("You have selected rectangle to find its area");
			System.out.println("Enter length of a rectangle");
			double l=sc.nextDouble();
			System.out.println("Enter breadth of a rectangle");
			double b=sc.nextDouble();
			System.out.println("Area of a rectangle : "+l*b);
		}
		else if(choice==5)
		{
			System.out.println("You have selected rhombus to find its area");
			System.out.println("Enter first diagonal");
			double d1=sc.nextDouble();
			System.out.println("Enter second diagonal");
			double d2=sc.nextDouble();
			System.out.println("Area of a rhombus : "+0.5*d1*d2);
		}
		else
		{
			System.out.println("Enter valid input");
		}
		System.out.println("========================= ");
		System.out.println("Thank You");
		System.out.println("=========================");

	}
}