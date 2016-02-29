public class sumtree {
	private static int sum(treenode root)
	{
		if(root == null) return 0;
		return (root.val)  + sum(root.left) + sum(root.right);	
	}
	private static boolean check(treenode root)
	{
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		int leftnum = sum(root.left);
		int rightnum = sum(root.right);	
		if((root.val == leftnum + rightnum) && (check(root.left)) && (check(root.right)))	
			return true;	
		else
			return false;
			
	}	
	public static void main(String[] args)
	{
		treenode root = new treenode(42);
		root.left = new treenode(9);	 		
		root.right = new treenode(12);
		root.left.right = new treenode(3);	 		
		root.left.left = new treenode(6);	 		
		root.right.left = new treenode(6);	 		
		root.right.right = new treenode(6);	 	
		boolean result = check(root);			
		System.out.println(result);
	}
}
