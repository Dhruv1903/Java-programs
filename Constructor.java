class Constructor
{
	Constructor()
	{
		System.out.println("Constructor Without parameter.");
	}
	Constructor(int a)
	{
		System.out.println("Constructor With 1 parameter.");
	}
	Constructor(int a,int b)
	{
		System.out.println("Constructor With 2 parameter.");
	}
	Constructor(int ... a)
	{
		System.out.println("Constructor With n parameter.");
	}
	
	{
		System.out.println("Inside instance block");
	}
	static{
		System.out.println("Inside static block");
	}

	public static void main(String args[])
	{
		Constructor obj=new Constructor(2,3,4,5,4);
		Constructor obj1=new Constructor(2,3,4);
	}
}