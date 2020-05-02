class Str
{
	String n;
	Str()
	{
		n="hello world this is nikhil";
	}
	String strReverse(String n)
	{
		String r="";
		int count=n.length()-1;
		String ar[]=n.split("");
		for(String i:ar)
		{
			r=r.concat(ar[count]);
			count--;
		}
		System.out.println(r);
		return r;
	}
	String fupr(String n)
	{
		String r="";
		String ar[]=n.split(" ");
		int count=0;
		for (String i:ar)
		{
			ar[count]=i.substring(0,1).toUpperCase()+i.substring(1).concat(" ");
			r=r.concat(ar[count]);
			count++;
		}
		n=r.trim();
		return n;
	}
	public static void main(String s[])
	{
		String p;
		Str o=new Str();
		//p=o.fupr(o.n);
		p=o.strReverse(o.n);
		//System.out.println(p);
	}
}