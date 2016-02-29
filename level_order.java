import java.util.*;
public class level_order{
	private static int min;
	private static int max;
	private static void print(treenode root,int w,Map<Integer,List<Integer>> H){
		List<Integer> L;
		if(root == null)
			return;
		if(w < min)
			min = w;
		if(w > max)
			max = w;
		if(H.get(w) == null){
			H.put(w,new ArrayList<Integer>());
		}
		L = H.get(w);
		L.add(root.val);
		print(root.left,w-1,H);
		print(root.right,w+1,H);	
		return;
	}
	public static void main(String[] args){
		treenode root = new treenode(42);
                root.left = new treenode(9);
                root.right = new treenode(50);
                root.left.right = new treenode(10);
                root.left.left = new treenode(6);
                root.right.left = new treenode(45);
                root.right.right = new treenode(55);
		min = Integer.MAX_VALUE;
		Map<Integer,List<Integer>> H = new HashMap<Integer,List<Integer>>();
		List<Integer> L;
		print(root,0,H);
		System.out.println(min);
		for(int i = min;i <= max;i++){
			L = H.get(i);
			for(int j = 0;j < L.size();j++){
				System.out.print(L.get(j));
				System.out.print(" ");
			}
			System.out.println();
		}
		
			
	}
}
