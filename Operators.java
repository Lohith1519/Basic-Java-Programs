class  Operators
{
	public static void main(String[] args) 
	{
		//Arithmetic Operators
		System.out.println("===========================================");
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2);
		System.out.println(5%2);
		System.out.println(5.0/2);
		System.out.println("===========================================");
		

		System.out.println("===========================================");
		System.out.println('A'+10);
		System.out.println('A'+'B');
		System.out.println("Hello"+10);
		System.out.println(10+20+"Hello");
		System.out.println("Hello"+10+20);
		System.out.println("Hello"+'A');
		System.out.println("Hello"+'A'+'B');
		System.out.println('A'+'B'+"Hello");
		System.out.println("Hello"+"Everyone");
		System.out.println("===========================================");


		System.out.println("===========================================");
		System.out.println("Hello"-10);
		System.out.println(10+false);
		System.out.println(true-true);
		System.out.println("===========================================");

		//Relational Operators

		System.out.println("===========================================");
		System.out.println(2<1);
		System.out.println(3>2);
		System.out.println(5<=10);
		System.out.println(12>=10);
		System.out.println(5==5);
		System.out.println("===========================================");

		//Logical Operators

		System.out.println("===========================================");
		System.out.println(2>1&&3<2);
		System.out.println(5<=10||12>=10);
		System.out.println(!(5==5));
		System.out.println("===========================================");

		//Assignment Operators
		int x=10;
		int y=20;
		x=y;

		System.out.println("===========================================");
		System.out.println(x);
		System.out.println(y);
		System.out.println("===========================================");

		//Conditional Operators

		int a=5;
		int b=(a<10)?20:5;
		System.out.println("===========================================");
		System.out.println(b);
		System.out.println("===========================================");
		
	}
}
