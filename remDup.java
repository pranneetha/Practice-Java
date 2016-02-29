import java.util.*;
class node{
	int num;
	node next;
	public node(int n){
		this.num = n;
	}
}
public class remDup{
	private static node remove(node head){
		node temp = head;
		node temp1;int curr = 0;
		while(temp != null){
			temp1 = temp;
			curr = temp.num;
			while(temp1.next != null){
				if(curr == temp1.next.num){
					temp1.next = temp1.next.next;	
				}
				else
					temp1 = temp1.next;	
			}
			//if(temp != null)
			//	break;	
			temp = temp.next;
		}		
		return head;
	}
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt(), i = 0;
		node head = new node(inp.nextInt());
		head.next = null;
		node temp = head;
		for(i = 0;i < n-1;i++){
			temp.next = new node(inp.nextInt());	
			temp = temp.next;
			temp.next = null;
		}
		head = remove(head);		
		System.out.println("defewfwe fewfef");	
		temp = head;
		while(temp != null){
			System.out.println(temp.num);
			temp = temp.next;
		}
	}
}
