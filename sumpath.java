import java.util.*;
public class sumpath{
	private static boolean ret;
	private static void find(tnode root, int curr, int sum){
		if(root == null){
			if(curr == sum){
				ret = true;
			}
			return;
		}
		System.out.println(root.val);
		find(root.left,curr+root.val,sum);	
		find(root.right,curr+root.val,sum);
		return;	
	} 
	public static void main(String[] args){
		tnode root;
                Scanner S  = new Scanner(System.in);
		int i = 0;
                root = new tnode(20);
                root.left = new tnode(12);
                root.left.parent = root;
                root.right = new tnode(30);
                root.right.parent = root;
                root.left.left = new tnode(8);
                root.left.left.parent = root.left;
                root.left.right = new tnode(16);
                root.left.right.parent = root.left;
                root.left.left.left = new tnode(4);
                root.left.left.left.parent = root.left.left;
                root.left.left.right = new tnode(10);
                root.left.left.right.parent = root.left.left;
                root.right.left = new tnode(24);
                root.right.left.parent = root.right;
                root.right.right = new tnode(36);
                root.right.right.parent = root.right;
		int k = Integer.parseInt(S.nextLine());
		ret = false;
		find(root, 0, k);
		System.out.println(ret);
	} 	
} 
