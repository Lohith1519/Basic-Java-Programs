import java.util.Scanner;
class  AreaOfTheCircle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("=================================");
		System.out.println("Area and Circumference of the circle");
		System.out.println("=================================");

		System.out.println("Enter the radius of the circle :");
		double r= sc.nextDouble();

		System.out.println("=================================");
		System.out.println("radius r :" +r);
		System.out.println("diameter d :" +2*r);
		System.out.println("circumference c :" +2*3.14*r);
		System.out.println("Area a :" +3.14*r*r);
		System.out.println("=================================");









	}
}
