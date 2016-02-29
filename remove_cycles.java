import java.util.*;
public class remove_cycles{
	static int[] parent;
	private static Map<Integer,List<Integer>> G;
	private static void print_all(int curr,int dest){
		int par = -1;
		System.out.println("PRINTALL");
		System.out.println(curr);
		while(curr != dest)
		{
			par = parent[curr];
			curr = par;
			System.out.println(par);
			
		}	
	}
	private static void remove(int n, int m, int start)
	{
		
		Stack<tuple> S = new Stack<tuple>();
		int i = 0, j = 0,len = 0, v = 0, nbr = 0; 
		tuple t;
		t = new tuple(n, start); 
		S.push(t);
		int[] marked = new int[n+1];
		parent = new int[n+1];
		for( i =0;i < n+1;i++){marked[i] = 0;parent[i] =-2;}
		while(!S.empty())
		{
			t = S.pop();
			System.out.print("popping ");
			System.out.println(t.x);
			System.out.println(t.y);
			if(marked[t.y] == 0)
			{	
				marked[t.y] = marked[t.x] + 1;
				parent[t.y] = t.x;
				j = 0;
				v = t.y;
				len = G.get(v).size();
				while(j < len){
					nbr = G.get(v).get(j);
						S.push(new tuple(v, nbr));	
					//else if(nbr != parent[v])
					//{
					//	System.out.print("Cycle Detected ");		
					//	System.out.print(nbr);
					//	System.out.print(" ");
					//	System.out.println(v);
					//}	
					j++;
				}	
			}			
			else if(t.x != -1 && t.y != parent[t.x] && marked[t.x] < marked[t.y])		// Detecting cycle here
			{
						System.out.print("Cycle Detected ");
						print_all(t.y, t.x);		
						System.out.print(t.y);
						System.out.print(" ");
						System.out.println(t.x);
			
			}
		}
		return;
				
	}
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);		
		int n = stdin.nextInt(), i =0, j = 0, k = 0;
		G = new HashMap<Integer, List<Integer>>(); 
		for(i = 0;i < n;i++)
			G.put(i,new ArrayList<Integer>());
		int m = stdin.nextInt();
		for(k = 0;k < m;k++)
		{
			i = stdin.nextInt();	
			j = stdin.nextInt();	
			G.get(i).add(j);	
			G.get(j).add(i);	
		}
		remove(n,m,0);
		for(i = 0;i < n;i++)
		{
			System.out.print(i);	
			System.out.print(" Parent ");	
			System.out.println(parent[i]);	
		}
		
	}		
}
