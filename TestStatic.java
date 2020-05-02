class Demo
{
	void show()
	{
		static int a=0;
		System.out.println("value is "+a);
		a+=5;
	}
	public static void main(String ar[])
	{
		Demo d=new Demo();
		d.show();
	}
}