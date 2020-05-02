class Demo
{
	public static void main(String ar[])
	{
		try{
			String a=ar[0];
			int i=Integer.parseInt(a);
			System.out.println("Vslue of i is "+i);
		}catch(NumberFormatException e)
		{
			System.out.println("String Doesnot contain value...");
		}
	}
}