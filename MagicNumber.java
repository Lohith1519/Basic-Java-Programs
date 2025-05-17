import java.util.Scanner;
class MagicNumber
	{
    public static void main(String[] args)
		{
        Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum= num;

         while (sum > 9) 
		{
            int x = sum;
            sum = 0;

              while (x != 0)
			{
				int ld=x%10;
                sum =sum+ld;
                x = x/10;
            }
        }

         if (sum == 1) {
            System.out.println(num + " is a magic number.");
        } else {
            System.out.println(num + " is not a magic number.");
        }
    }
}
