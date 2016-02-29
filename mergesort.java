import java.util.*;

public class mergesort{
	private static void merge(int[] a, int start, int mid , int end){
		int i = start,j = mid+1, k = 0;
		int[] tmp = new int[end-start+1];
		while(i <= mid && j <= end)
		{
			if(a[i] < a[j]){
				tmp[k] = a[i];
				i++;
			}
			else{
				tmp[k] = a[j];
				j++;
			}
			k++;
		}
		while(i <= mid){
			tmp[k] = a[i];i++;k++;
		}
		while(j <= end){
			tmp[k] = a[j];j++;k++;
		}
		for(i = start;i <= end;i++)
			a[i] = tmp[i-start];
		return;
	}
	private static void sort(int[] a, int start, int end)
	{
		int mid;
		if(start < end){
			mid = (start+end)/2;
			System.out.println(mid);	
			sort(a, start, mid);
			sort(a, mid+1, end);
			merge(a,start, mid, end);	
		}	
		return;
	}		
			
	public static void main(String[] args)
	{
		int i = 0, n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] a = new int[n];
		for(i = 0;i < n;i++){
			a[i] = in.nextInt();	
		}
		sort(a,0,n-1);	
		for(i = 0;i < n;i++)
			System.out.println(a[i]);				
	}
}
