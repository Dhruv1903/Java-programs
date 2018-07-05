class BinarySearch
{
    int BSearch(int arr[], int a, int b, int c)
    {
        if (b>=a)
        {
            int mid = a + (b - a)/2;
            if (arr[mid] == c)
               return mid;
            else if (arr[mid] > c)
               return BSearch(arr, a, mid-1, c);
       	    else	
            return BSearch(arr, mid+1, b, c);
        }
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch obj = new BinarySearch();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int x = 8;
        int r = obj.BSearch(arr,0,n-1,x);
        if (r == -1)
            System.out.println("Element absent");
        else
            System.out.println("Element is at index " + r);
    }
}