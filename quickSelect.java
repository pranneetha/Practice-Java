blic class quickSelect{
	private static int search(int[] a, int n, int k)
	{
		int start = 0, end = n-1,mid = 0;	
		int i = 0,temp = 0,pivot = n-1,j = -1,f = 0;	
		if(k >= n)
			return -1;
		while(true)
		{
			f++;
			for(i = start;i < end;i++)
			{
				if(a[i] > a[pivot]){
				}	
				else{
					j++;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			temp = a[pivot];
			a[pivot] = a[j+1];
			a[j+1] = temp;
			if(j+1 == k)
				return a[j+1];
			else if (j+1 > k){
				System.out.println("first if");
				System.out.println(j);	
				end = j;
				pivot = end;
				j = start-1;	
			}
			else{
				System.out.println("second if");
				System.out.println(j);	
				start = j+1;
			}
		}
		
	}
	public static void main(String[] args)
	{
		int i = 0;		
		int n = Integer.parseInt(args[0]);	
		int[] arr = new int[n];
		for(i = 0;i < n;i++)
		{
			arr[i] = Integer.parseInt(args[i+1]);	
		}
		int k = Integer.parseInt(args[i+1]);
		int m = search(arr,n, k);
		System.out.println(m);
	}
}
