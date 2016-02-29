import java.util.*;
public class nextInorder{
	private static tnode find(tnode curr){
		if(curr.right != null){
			curr = curr.right;	
			while(curr.left != null){
				curr = curr.left;	
			}	
			return curr;	
		}
		else{
			if(curr.parent != null){
				while(curr != curr.parent.left){
					curr = curr.parent;
				}
				return curr.parent;			
			}
			else{
				return null;
			}
		}
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
		tnode res = find(root.left.left.left);
		System.out.println(res.val);	
	}
			
}
