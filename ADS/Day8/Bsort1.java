class Bsort1
{
		void bsort(int arr[])
		{
		int n = arr.length;
		boolean flag;
		for(int i=0;i<n-1;i++)
		{
			flag = false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=true;
				}
					
			}
		}
		
	
}
void ssort(int arr[])
{
	int n = arr.length;
	for(int i=0;i<n-1;i++)
	{
		int min = i;
		for(int j=i+1;j<n;j++)
			if(arr[j] < arr[min])
				min = j;
				
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
		
	}
}
void isort(int arr[])
{
	int n = arr.length;
	for(int i = 1;i<n;i++)
	{
		int key = arr[i];
		int j=i-1;
		
		while(j>=0 && arr[j]>key)
		{
			arr[j+1] = arr[j];
			j=j-1;
		}
		arr[j+1] = key;
		
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
		Bsort1 h1 = new Bsort1();
		int arr[]={99,89,34,11,55,33,88,44,22};
		h1.display(arr);
		//h1.bsort(arr);
		//h1.ssort(arr);
		h1.isort(arr);
		System.out.println();
		h1.display(arr);
		
	}
}

