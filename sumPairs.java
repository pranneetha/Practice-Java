import java.util.*;
public class sumPairs{
	public static void main(String[] args){
		int k = 0,i = 0,n = 0,j = 0,m = 0; int[] a;
		n  = Integer.parseInt(args[0]);
		int []arr = new int[n];
		List<int[]> L;
		List<int[]> I;
		for(i = 0;i < n;i++){
			arr[i] = Integer.parseInt(args[i+1]);
		}
		Map<Integer,List<int[]>> H = new HashMap<Integer, List<int[]>>();
		int[] b;	
		for(i = 0;i < n;i++){
			for(j = i+1;j < n;j++){
				m = arr[i] + arr[j];
				if(H.get(m) == null){
					a = new int[2];a[0] = i;a[1] = j;
					L = new ArrayList<int[]>();
					L.add(a);
					H.put(m,L);
				}
				else{
					a = new int[2];a[0] = i;a[1] = j;
					I = H.get(m);
					for(k = 0;k < I.size();k++){
						if(I.get(k)[0] == i || I.get(k)[1] == j || I.get(k)[0] == j || I.get(k)[1] == i){
						}
						else{
						System.out.println(arr[I.get(k)[0]] + " " + arr[I.get(k)[1]] + " " + arr[i] + " " + arr[j]);	
						}
						
					}
                                        I.add(a);
				}
					
			}
		}		
		
	}
}
