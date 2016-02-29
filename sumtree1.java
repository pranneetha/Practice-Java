public class sumtree1 {
	private static boolean res = true;
	private static int sum(treenode root)
	{
		if(root == null) return 0;
		return (root.val)  + sum(root.left) + sum(root.right);	
	}
	private static int check(treenode root)
	{
		if(res == false) return -1;	
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return root.val;
		int leftnum = check(root.left);
		int rightnum = check(root.right);	
		if((root.val == leftnum + rightnum))
		{	
			return root.val + leftnum + rightnum;	
		}
		else
		{
			res = false;
			return -1;
		}
			
	}	
	public static void main(String[] args)
	{
		treenode root = new treenode(42);
		root.left = new treenode(10);	 		
		root.right = new treenode(11);
		root.left.right = new treenode(4);	 		
		root.left.left = new treenode(6);	 		
		root.right.left = new treenode(6);	 		
		root.right.right = new treenode(5);	 	
		int result = check(root);			
		System.out.println(res);
	}
}
