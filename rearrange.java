import java.util.*;
import java.lang.String;
	class node implements Comparator<node>, Comparable<node>{
		char alpha;
		int freq;
		node(char c, int n)
		{
			alpha= c;
			freq = n;
		}
		public int compareTo(node a)
		{
			return a.freq - (this.freq);
		}	
		public int compare(node a, node b)
		{
			return b.freq-a.freq;
		}	
	}
public class rearrange{
	private static char[] output;
	private static boolean fn(List<node> list, int inp_size)
	{
		output = new char[inp_size]; char c;	
		int j = 0,i = 0, k = 0, index = 0, count = 0, list_size = 0;
		for(i = 0;i < inp_size;i++)
		{
			output[i] = 0;
		}
		index = 0;
		list_size = list.size();
		for(i = 0;i < list_size;i++)
		{	
			c = list.get(i).alpha;
			j = i;			// getting the first available character
			while(output[j] != 0)
			{
				j++;
			}
			for(k = 0;j + 2*k < inp_size && k < list.get(i).freq;k++)
			{
				output[j + 2*k] = c;
			}		
				if(j + 2*k >= inp_size && k < list.get(i).freq)
					return false;			

		}
		return true;	
	}	
	public static void main(String[] args)
	{
		int i = 0;
		
		char[] inp = args[0].toCharArray();
		int inp_size = args[0].length();
		Map<Character, Integer> M = new HashMap<Character, Integer>();
		for(i = 0;i < inp_size;i++)
		{
			if(M.get(inp[i])!=null)
				M.put(inp[i],M.get(inp[i])+1);
			else
				M.put(inp[i],1);	
		}
		List<node> list = new ArrayList<node>();
		for(char c_iter : M.keySet())
		{
			list.add(new node(c_iter, M.get(c_iter)));	
		}
		Collections.sort(list);
		boolean res = fn(list, inp_size);
		if(res)
		{
			for(i = 0;i < output.length;i++){
				System.out.print(output[i]);
				System.out.print(" ");
			}	
		}
	}
} 
