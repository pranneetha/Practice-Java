import java.lang.String;
public class hops{
	private static int[] fn(int[] arr, int n)
	{
		int i = 0, j = 0;
		int temp_min = Integer.MAX_VALUE;
		int[] out = new int[n];
		out[n-1] = 0;
		for(i = n-2;i>=0;i--)
		{
			temp_min = Integer.MAX_VALUE;
			System.out.print(i);	
			System.out.print("  ");	
			for(j = 1;j <= arr[i];j++)
			{
				System.out.print("in for ");
				if(i + j >= n-1)
					temp_min = 1; 
				else if(temp_min > 1 + out[i+j])	
					temp_min = 1 + out[i+j];
			}
			System.out.println(temp_min);	
			out[i] = temp_min;
		}
		return out;	
	}	
	public static void main(String[] args)	
	{
		int i = 0;
		int n = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		int[] out = new int[n];
		for(i = 0;i <n;i++)
		{
			arr[i] = Integer.parseInt(args[1+i]);	
		}
		
		out = fn(arr, n);
		System.out.println(out[0]);
	}	
}
