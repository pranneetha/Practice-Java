public class minCoin{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);	
		int i = 0;int[] arr = new int[n];
		int min = 0;
		for(i = 0;i < n;i++){
			arr[i] = Integer.parseInt(args[i+1]);	
		}
		int m = Integer.parseInt(args[i+1]);
		int[] dp = new int[m+1];
		dp[0] = 0;
		for(i = 1;i <= m;i++){
			min = Integer.MAX_VALUE;
			for(j = 0;j < n;j++){
				if(i - arr[j] >= 0){
					if(dp[i - arr[j]] < Integer.MAX_INT && dp[i-arr[j]] + 1 < min){
						min = dp[i-arr[j]] + 1;	
					}	
				}
			}		
			dp[i] = min; 	
		}
		System.out.println("min nuber of coins is %d\n",dp[m]);			
	}
}
