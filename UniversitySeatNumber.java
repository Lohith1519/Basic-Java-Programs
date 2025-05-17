import java.util.Scanner;
class  UniversitySeatNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("===========================================");
		System.out.println("University Seat Number for a Student");
		System.out.println("===========================================");
		
		System.out.println("Enter year of joining : ");
		int y=sc.nextInt();
		
		System.out.println("Enter fisrt 2 letters of Department Name : ");
		String d=sc.next();

		System.out.println("Enter Roll Number : ");
		int r=sc.nextInt();	

		System.out.println("===========================================");
		System.out.println("University Seat Number is generated succesfully....!!  : " );
		System.out.println("University Seat Number : " +y+d+r);
		System.out.println("Thank You");
		System.out.println("===========================================");

		
		
	
	}
}
