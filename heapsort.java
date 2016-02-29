import java.lang.*;
import java.util.*;
public class heapsrt{
		static class PQSort implements Comparator<Integer>{
                	public int compare(Integer n1, Integer n2){
                        	return n1 - n2;
                	}
        	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]),i = 0;
		int []arr = new int[n];
		PQSort pq = new PQSort();
                PriorityQueue<Integer> Q = new PriorityQueue<Integer>(n, pq);
		for(i = 0;i < n;i++){
			Q.add(Integer.parseInt(args[i+1]));	
		}
		
		
			
	}			
}
