public class LCA_bintree{
	private static boolean v1, v2;
	private static treenode findlca(treenode root, int n1, int n2)
	{		
		treenode leftlca, rightlca;
		if(root == null)
			return null;
		else
		{
			if(root.val == n1)
			{
				v1 = true;
				return root;
			}
			if(root.val == n2)
			{
				v2 = true;
				return root;
			}
			leftlca = findlca(root.left,n1,n2);
			rightlca = findlca(root.right,n1,n2);
			if(leftlca != null && rightlca != null)
				return root;
			if(leftlca != null)	return leftlca;
			if(rightlca != null)	return rightlca;
			return null;	
		}
	}
	private static boolean find(treenode root, int n)
	{
		if(root == null)
			return false;
		if(root.val == n || find(root.left,n) || find(root.right,n))
			return true;
		else
			return false;	
	}
	public static void main(String[] args)
	{
		int n;
		v1 = false;v2 = false;
		int i = 0,j = 0;
		treenode root = new treenode(8);
		root.left = new treenode(4);
		root.right = new treenode(10);
		root.left.left = new treenode(3);
		root.left.right = new treenode(7);
		root.right.right = new treenode(11);	
		int n1, n2;
		n1 = Integer.parseInt(args[0]);	
		n2 = Integer.parseInt(args[1]);
		treenode lca = findlca(root,n1,n2);
		if((v1 == true && v2 == true) || (v1 == true && find(lca,n2)) || (v2 == true && find(lca,n1)))
			System.out.println(lca.val);	
		else
			System.out.println("Not found");	
	}
}
