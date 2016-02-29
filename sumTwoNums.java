import java.util.*;
public class sumTwoNums{
		
	public static void main(String[] args){
		int i = 0; Boolean val;
		int n = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		for(i = 0;i < n;i++){
			arr[i] = Integer.parseInt(args[i+1]);	
		}
		int k = Integer.parseInt(args[i+1]);
		Map<Integer,Boolean> H = new HashMap<Integer,Boolean>();
		for(i = 0;i < n;i++){
			if(H.get(k-arr[i])== null && H.get(arr[i]) == null){
				H.put(arr[i],false);
			}
			else if(H.get(k-arr[i])!=null){
				val = H.get(k-arr[i]);
				if(!val){
					H.put(k-arr[i],true);
					System.out.println(arr[i] + " " + (k-arr[i]));
				}
			}
			
		}				
	}
}
