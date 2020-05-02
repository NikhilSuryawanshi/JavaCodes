class Array
{	int a[];
	int n;
	Array()
	{
		System.out.print("Enter the size of array : ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter value of a["+i+"] = ");
			a[i]=s.nextInt();
		}
		System.out.println("-------Done!-------");
	}
	
	int secBig(int[] arr )
	{	int big=0;
		int sb=0;
		for (int i=0;i<n;i++)
		{
			if(arr[i]>=big)
			{	sb=big;
				big=arr[i];
			}
		}
		if(big==arr[0])
		{
			sb=arr[1];
			for (int i=2;i<n;i++)
		{
			if(arr[i]>=sb)
			{	
				sb=arr[i];
			}
		}

		}
		return sb;
	}
	int secSmall(int[] arr )
	{	int small=arr[0];
		int sm=0;
		for (int i=1;i<n;i++)
		{
			if(arr[i]<=small)     
			{	sm=small;
				small=arr[i];
			}
		}
		if(small==arr[0])
		{
			sm=arr[1];
			for (int i=2;i<n;i++)
		{
			if(arr[i]<=sm)
			{	
				sm=arr[i];
			}
		}

		}
		return sm;
	}
	void repeatCounter(int[] arr)
	{
		int count;
		for (int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					
				}
			}
			
			
		}
	}
	void prime(int[] arr)
	{
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0&&arr[i]%3!=0&&arr[i]%5!=0&&arr[i]%7!=0)
			{
				System.out.println("Index a["+i+"]="+arr[i]+" is Prime number.");
			}
			else if(arr[i]==2||arr[i]==3||arr[i]==5||arr[i]==7)
			{
				System.out.println("Index a["+i+"]="+arr[i]+" is Prime number.");
			}
			else
			{
				System.out.println("Index a["+i+"]="+arr[i]+" is not Prime number.");
			}
			
		}
		
		
	}
	void reverse(int[] arr)
	{
		int count=0;
		System.out.println("Reversed Value of Index-"); 
		for(int i=n-1;i>=0;i--)
		{
			System.out.println("a["+count+"]="+arr[i]);
			count++;
		}
	}
	
	void ascending(int[] arr)
	{
		int temp;
		for(int i=0;i<n;i++)
		{	
			for(int j=i;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	void descending(int[] arr)
	{
		int temp;
		for(int i=0;i<n;i++)
		{	
			for(int j=i;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
	

	
	public static void main(String args[])
	{
		Array o=new Array();
		//System.out.println("Second Biggest is "+o.secBig(o.a));
		//System.out.println("Second smallest is "+o.secSmall(o.a));
		o.repeatCounter(o.a);
		//o.prime(o.a);
		//o.reverse(o.a);
		//o.ascending(o.a);
		//o.descending(o.a);
	}
	
	
	
}