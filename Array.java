package src;
import java.util.Scanner;
 class Array
{	static int[] GetArrayVal()
	{	
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter the arr size = ");
		n=s.nextInt();
		int a[]=new int[n];
		
		for (int i=0;i<n;i++)
		{
			System.err.print("Enter the a["+i+"] values of array : ");
			a[i]=s.nextInt();
		}
		return a;
	}
	int small(int a[])
	{
		int y=0;
		boolean x=true;
		for(int i:a)
		{
			if(x==true)
			{
				y=i;
				x=false;
			}
			if(i<y)
			{
				y=i;
			}
		}
		return y;
	}
	//------------------------
	int large(int a[])
	{
		int y=0;
		boolean x=true;
		for(int i:a)
		{
			if(x==true)
			{
				y=i;
				x=false;
			}
			if(i>y)
			{
				y=i;
			}
		}
		return y;
	}
	//----------------------------
	int sum(int a[])
	{
		int y=0;
		for(int i:a)
		{
				y=y+i;
		}
		return y;
	}
	//----------------------------
	
	public static void main(String s[])
	{
	Array arr=new Array();
	System.out.println("S= "+a.sum(val()));
		
	}
}