class BubbleSort
{
	public static void main(String args[])
	{
		int arr[]={54,42,39,16,28};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<(arr.length-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}