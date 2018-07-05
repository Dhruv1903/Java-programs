class Same
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
		if((a^b) != 0)
		System.out.println("Not same");
		else
		System.out.println("Same");
	}
}