class Demo
{
	public static void main(String ar[])
	{
		try{
			int ary[]=new int[5];
			ary[5]=10/2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cant divide by zero...");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index not found....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}