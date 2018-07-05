public class Encryption
{
	public static void main(String args[])
	{
		String pt=args[0],ct="";
		int key=Integer.parseInt(args[1]);
		for(int i=0;i<pt.length();i++)
		{
			ct += (char)(pt.charAt(i) + key);
		}
		System.out.println(ct);
		pt="";
		for(int i=0;i<ct.length();i++)
		{
			pt += (char)(ct.charAt(i) - key);
		}
		System.out.println(pt);
	}
}