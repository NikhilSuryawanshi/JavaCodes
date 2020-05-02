class Demo
{
	void show()
	{
		System.out.println("Show is runnig..");
	}
	public static void main(String ar[])
	{
		try{
			Demo d=new Demo();
			d=null;
			d.show();
		}
		catch(NullPointerException e)
		{
			System.out.println("Refrence variable shows null");
		}
		
	}
}