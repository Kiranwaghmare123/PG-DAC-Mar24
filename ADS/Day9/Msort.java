class Msort
{
	static void mergesort(int arr[],int l, int r)	
	{
		if(l<r)
		{
			int mid = (l+(r-l)/2);
			mergesort(arr, l, mid);//left part
			mergesort(arr, mid+1, r);// right part
			merge(arr, l, mid, r);
	
		}
	}

static void merge(int arr[],int l, int mid, int r )
{
	int n1 = mid-l+1;
	int n2 = r-mid;
	
	int L[]= new int[n1];
	int R[]= new int[n2];
	
	for(int i=0;i<n1;i++)
		L[i] = arr[l+i];
	
	for(int j=0;j<n2;j++)
		R[j] = arr[mid+1+j];
	
	int i=0, j=0;
	int k=l;
	while(i<n1 && j<n2)
	{
		if(L[i] <= R[j])
		{
			arr[k] = L[i];
			i++;
		}
		else
		{
			arr[k] = R[j];
			j++;
		}
		k++;
	}
	
	while(i<n1)
	{
		arr[k] = L[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		arr[k] = R[j];
		j++;
		k++;
	}
	
	
	
	
	
}
	
	void display(int arr[])
	{
		int n =arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[])
	{
		Msort h1 = new Msort();
		int arr[]={99,89,34,11,55,33,88,44,22};
		
		int n = arr.length;
		h1.display(arr);
		
		mergesort(arr, 0, n-1);
		System.out.println();
		h1.display(arr);
		
	}
}

