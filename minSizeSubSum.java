import java.util.*;
public class minSizeSubSum{
	private static int get(int[] arr, int n, int s){
		
		int start = 0, end = 0;int curr_len = 0,min_len = n+1;int curr_sum = 0;
		while( end < n){	
			curr_sum = curr_sum + arr[end];
			end++;
			curr_len++;
			if(curr_sum >= s){
				if(curr_len < min_len)	
					min_len = curr_len;
				if(start == end){
					curr_len = 1;min_len = 1;
					end++;start++;	
					break;
				}
				else{
					while(curr_sum >= s){
						curr_sum -= arr[start];
						start++;
						curr_len--;
					}
					if(curr_len+1 < min_len)
					{
						min_len = curr_len+1;
						System.out.print(start + " ");
						System.out.println(end);
					}
				}
			}	
		}
		if(min_len >= n+1)
		return -1;
		else
		return min_len;
	}	
	public static void main(String[] args){
		int i = 0,n = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		for(i = 0;i < n;i++){
			arr[i] = Integer.parseInt(args[i+1]);	
		}
		int s = Integer.parseInt(args[i+1]);	
		int ans = get(arr,n,s);	
		System.out.println(ans);
	}	
}
