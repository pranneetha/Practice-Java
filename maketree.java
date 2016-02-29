public class maketree{
	private static void print(tnode root){
		if(root == null)
			return;
		else{
			print(root.left);
			System.out.println(root.val);	
			print(root.right);
		}
		return;
	}
	private static tnode create(int[] arr, int start, int end){
		tnode new_node = null;
		if(start == end){
			new_node = new tnode(arr[start]);
		}
		else if (start == end - 1){
			new_node = new tnode(arr[start]);
			new_node.right = new tnode(arr[end]);
		}
		else{
			new_node = new tnode(arr[(start+end)/2]);
			new_node.left = create(arr,start,((start+end)/2)-1);
			new_node.right = create(arr,((start+end)/2)+1,end);	
		}
		return new_node;
	}
	public static void main(String[] args){
		int i = 0;
		int n = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		for(i = 0;i < n;i++){
			arr[i] = Integer.parseInt(args[i+1]);	
		}
		tnode root = create(arr,0,n-1);
		//print(root);	
		System.out.println(root.right.val);
	}	
}
