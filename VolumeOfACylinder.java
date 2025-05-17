import java.util.Scanner;
class VolumeOfACylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("Volume Of a Cylinder");
		System.out.println("======================================");
		
		System.out.println("Enter radius of a cylinder");
		double r=sc.nextDouble();

		System.out.println("Enter height of a cylinder");
		double h=sc.nextDouble();

		System.out.println("Volume of a Cylinder v:" +3.14*r*r*h);
		System.out.println("======================================");
	}
}
