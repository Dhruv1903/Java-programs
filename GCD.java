class GCD
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]),c=Integer.parseInt(args[2]),d=0,r;
		System.out.println("GCD of " + a + " & " + b + " & " + c + " is ");
		while(b>0)
		{
			d=a/b;
			r=a%b;
			a=b;
			b=r;
		}
		while(c>0)
		{
			d=a/c;
			r=a%c;
			a=c;
			c=r;
		}
		System.out.println(a);
	}
}