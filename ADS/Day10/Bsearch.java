class Bsearch
{
	static int search(int arr[],int l, int r, int key)
	{
		if(r>=l)
		{
			int mid=l+(r-l)/2;
			
			if(arr[mid] == key)
				return mid;
			if(arr[mid] > key)
				return search(arr,l,mid-1,key);//left side
			
			return search(arr,mid+1,r,key);//right side
		}
		return -1;
			
		
	}
	
	public static void main(String args[])
	{
		int x=11;
		int arr[]={2,3,4,5,6,9,11};
		int n=arr.length;
		int result = search(arr,0,n-1,x);
		
		if(result == -1)
			System.out.println("Not found !");
		else
			System.out.println("Found at index = " + result);
	}
}