class Exam
{
	static void test(int a,int b)
	{
		int p=a+b;
		System.out.println("Test with two arguments." + p);
	}
	static void test(int a,int b,int c)
	{
		int p=a+b+c;
		System.out.println("Test with three arguments." + p);
	}
	static void test(int a,int b,int c,int d)
	{
		int p=a+b+c+d;
		System.out.println("Test with four arguments." + p);
	}
	static void test(int ... a)
	{
		int i=0;
		for(int p:a)
		{i=i+p;}
		System.out.println("Addition is " + i);
	}
}
