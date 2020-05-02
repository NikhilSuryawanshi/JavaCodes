class Multi
{
	int a[][],b[][];
	int n1,n2;
	void getVal()
	{	
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("Enter the size of row of array : ");
		n1=s.nextInt();
		System.out.print("Enter the size of coloumn of array : ");
		n2=s.nextInt();
		a=new int[n1][n2];
		b=new int[n1][n2];
		for (int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				System.out.print("Enter value of a["+i+"]["+j+"] = ");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("-------Done!-------");
		for (int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				System.out.print("Enter value of b["+i+"]["+j+"] = ");
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("-------Done!-------");
	}
	void mulArr(int a[][],int b[][])
	{
		int sum=0;int c[][]=new int[3][3];
		for(int x=0;x<3;x++)
		{
			for (int i=0;i<n1;i++)
			{
				for(int j=0;j<n2;j++)
				{
					sum=sum+(a[i][j]*b[j][i]);
				}
				c[x][i]=sum;
				System.out.print(c[x][i]+"  ");
			}
			System.out.print("\n");
		}
		
		
		
	}
	
	public static void main(String s[])
	{
			Multi m=new Multi();
			m.getVal();
			m.mulArr(m.a,m.b);
	}
}