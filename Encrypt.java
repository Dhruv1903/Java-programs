public class Encrypt
{
	public static void main(String args[])
	{
		String pt="This is a String",ct="";
		String key = "word";
		for(int i=0;i<pt.length();i++)
		{
			ct += (char)(pt.charAt(i) + key.charAt(i%4));
		}
		System.out.println(ct);
		pt="";
		for(int i=0;i<ct.length();i++)
		{
			pt += (char)(ct.charAt(i) - key.charAt(i%4));
		}
		System.out.println(pt);
	}
}