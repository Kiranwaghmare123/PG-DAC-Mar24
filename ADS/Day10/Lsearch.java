class Lsearch
{
	static int search(int arr[], int key)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int x=2;
		int arr[]={2,31,47,15,6,9,11};
		int result = search(arr,x);
		if(result == -1)
			System.out.println("Not found !");
		else
			System.out.println("Found at index = " + result);
	}
}