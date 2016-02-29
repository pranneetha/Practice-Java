public class swapll{
	private static nodel swap(nodel start, int n, int k){
		int i = 0;
		if(n-2*k == 1){
		
		}	
	} 
	public static void main(String[] args){
		int i = 0,k;	
		int n = Integer.parseInt(args[0]);	
		nodel start = null,nn = null;
		for(i = 0;i < n;i++){
			if(i == 0){
				nn = new nodel(Integer.parseInt(args[i+1]));
				start = nn;
			}
			else{
				nn.next = new nodel(Integer.parseInt(args[i+1]));
				nn = nn.next;
			}
				
		}
		k = Integer.parseInt(args[i+1]);	
		if(k > n || k <= 0)
			System.out.println("Wrong Output");	
		else{
			if(k == n-k){
				System.out.println("Nothing to be swapped");
			}
			else{
				start = swap(start,n.k);
			}
		}
	}	
}
