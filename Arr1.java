class Array
{
	int a[],b[];
	int na,nb;
	void getVal()
	{	
		System.out.print("Enter the size of first array : ");
		java.util.Scanner s=new java.util.Scanner(System.in);
		na=s.nextInt();
		a=new int[na];
		for (int i=0;i<na;i++)
		{
			System.out.print("Enter value of a["+i+"] = ");
			a[i]=s.nextInt();
		}
		System.out.println("-------Done!-------");
		
		System.out.print("Enter the size of second array : ");
		nb=s.nextInt();
		b=new int[nb];
		for (int i=0;i<nb;i++)
		{
			System.out.print("Enter value of b["+i+"] = ");
			b[i]=s.nextInt();
		}
		System.out.println("-------Done!-------");
	}
	//--------------------------------------------
	void concate(int[] a,int[] b)
	{
		int c[];
		int a1=0,b1=0;
		c=new int[na+nb];
		
		for (int i=0;i<(na+nb);i++)
		{
			if(a1<na){
				c[i]=a[a1];
				a1++;
			}else if(b1<nb)
			{
				c[i]=b[b1];
				b1++;
			}
			
		}
		System.out.println("concated array are-");
		for (int i:c)
		{
			System.out.println(i);
		}
		
	}
	//--------------------------------------------
	
	void sumArr(int[] a,int[] b)
	{
		int c[];int nc;
		if(na>nb)
		{
			nc=na;
			c=new int[nc];
			for(int i=0;i<nc;i++)
			{
				if(i<nb)
				{
					c[i]=b[i];
				}else{
					c[i]=0;
				}
			}
			for(int i=0;i<nc;i++)
			{
				c[i]=c[i]+a[i];
				System.out.println("sum arr["+i+"] is "+c[i]);
			}
			
		}
		else if(nb>na)
		{
			nc=nb;
			c=new int[nc];
			for(int i=0;i<nc;i++)
			{
				if(i<na)
				{
					c[i]=a[i];
				}else{
					c[i]=0;
				}
			}
			for(int i=0;i<nc;i++)
			{
				c[i]=c[i]+b[i];
				System.out.println("sum arr["+i+"] is "+c[i]);
			}
			
		}
		else
		{
			nc=nb=na;
			c=new int[nc];
			for(int i=0;i<nc;i++)
			{
				c[i]=a[i]+b[i];
				System.out.println("sum arr["+i+"] is "+c[i]);
			}
		}
	}
	//--------------------------------------------
	void mulArr(int[] a,int[] b)
	{
		int c[];int nc;
		if(na>nb)
		{
			nc=na;
			c=new int[nc];
			for(int i=0;i<nc;i++)
			{
				if(i<nb)
				{
					c[i]=b[i];
				}else{
					c[i]=1;
				}
			}
			for(int i=0;i<nc;i++)
			{
				c[i]=c[i]*a[i];
				System.out.println("Mul arr["+i+"] is "+c[i]);
			}
			
		}
		else if(nb>na)
		{
			nc=nb;
			c=new int[nc];
			for(int i=0;i<nc;i++)
			{
				if(i<na)
				{
					c[i]=a[i];
				}else{
					c[i]=1;
				}
			}
			for(int i=0;i<nc;i++)
			{
				c[i]=c[i]*b[i];
				System.out.println("Mul arr["+i+"] is "+c[i]);
			}
			
		}
		else
		{
			nc=nb=na;
			c=new int[nc];
			for(int i=0;i<nc;i++)
			{
				c[i]=a[i]*b[i];
				System.out.println("Mul arr["+i+"] is "+c[i]);
			}
		}
	}
	//--------------------------------------------
	public static void main(String a[])
	{
		Array o=new Array();
		//o.getVal();
		//o.concate(o.a,o.b);
		//o.sumArr(o.a,o.b);
		//o.mulArr(o.a,o.b);
	}
}