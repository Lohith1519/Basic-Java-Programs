import java.util.Scanner;
class  ProfitPercentage
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Cost price");
		int cp=sc.nextInt();
		System.out.println("Enter Selling Price");
		int sp=sc.nextInt();
		System.out.println("Profit Percentage : "+((sp-cp)/cp)*100);
		
	}
}