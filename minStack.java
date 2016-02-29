import java.util.*;
public class minStack{
	static class mStack{
		private List<Integer> realStack;	
		private List<Integer> supportStack;	
		private int size;
		private int supportSize;
		public mStack(){
			realStack = new LinkedList<Integer>();
			supportStack = new LinkedList<Integer>();
			size = 0;
			supportSize = 0;
		}	
		public void myPush(int n){
			if(size == 0){
				realStack.add(n);
				supportStack.add(n);
				size++;
				supportSize++;
			}
			else if(size > 0){
				realStack.add(n);
				size++;
				if(n <= supportStack.get(supportSize-1)){
					supportStack.add(n);
					supportSize++;
				}
			}
		}
		public int myPop(){
			int n;
			if(size > 0){
				if(supportStack.get(supportSize-1) == realStack.get(size-1)){
					supportSize--;
					supportStack.remove(supportSize);
				}
				size--;
				n = realStack.get(size);
				realStack.remove(size);
				return n;
				
			}
			else
				return -1;	
		}
		public int getMin(){
			if(size > 0){
				return supportStack.get(supportSize-1);	
			}
			else
				return -1;
		}	
	}	
	public static void main(String[] args){
		int i = 0;
		mStack S = new mStack();
		S.myPush(1);
		S.myPush(2);
		S.myPush(-3);
		S.myPush(4);
		S.myPush(0);
		S.myPush(-2);
		S.myPush(-2);
		System.out.println(S.getMin());
		System.out.println(S.myPop());
		System.out.println(S.getMin());
		System.out.println(S.myPop());
		System.out.println(S.getMin());
			
	}
} 
