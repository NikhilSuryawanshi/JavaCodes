class Demo
{
	/*public static void main(String ar[])
	{
		int a=10/0;
		//System.out.println(a);
	}*/
	public static void main(String ar[])
	{
		try{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("It is an error...");
			e.printStackTrace();
		}
	}
}