class Calculator
{
	int addition(int a,int b)
	{
		int x = a + b;
		return x;
	}
	int subtract(int a,int b)
	{
		int x = a - b;
		return x;
	}
	int multiplication(int a,int b)
	{
		int x = a * b;
		return x;
	}
	int divide(int a,int b)
	{
		int x;
		if(a>b)
		x=a/b;
		else
		x=b/a;
		return x;
	}
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int x;
		Calculator obj=new Calculator();
		char c=args[2].charAt(0);
		if(a>0 && b>0)
		switch(c)
		{
			case '+': x=obj.addition(a,b);
				System.out.println(x);
				break;

			case '-': x=obj.subtract(a,b);
				System.out.println(x);
				break;

			case '@': x=obj.multiplication(a,b);
				System.out.println(x);
				break;

			case '/': x=obj.divide(a,b);
				System.out.println(x);
				break;

			default:System.out.println("Invalid Input!!");
				break;
		}
		else
		System.out.println("Invalid Number!!");
	}
}