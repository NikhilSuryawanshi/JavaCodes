class Demo
{
	public static void main(String ar[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int s=sc.nextInt();
		int ary[]=new int[s];
		System.out.print("Enter position : ");
		int p=sc.nextInt();
		System.out.print("Enter value : ");
		int v=sc.nextInt();
		try
		{
			ary[p-1]=v;
			System.out.println("Element at position "+p+" is "+ary[p-1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index not Found..");
		}
	}
}