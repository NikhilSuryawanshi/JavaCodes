import java.util.Scanner;
class Demo
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);		{
		System.out.println("Enter the number for dimensions: ");
		int a=s.nextInt();
		int b=s.nextInt();
		try{
			int c=a/b;
			System.out.println("Div is : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Exucuye always.");
		}
	}
		
	}
}