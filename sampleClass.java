import java.util.*;
public class sampleClass{
	int num;
	Node n;
	public sampleClass(int num, Node n){
		this.num = num;
		this.n = n;
	}
	public static sampleClass copySample(sampleClass S){
		Node temp = S.n;
		return new sampleClass(S.num,new Node(temp.a,temp.b));
	}
	public static void main(String[] args){	
		Node k = new Node("Pranneetha",1);
		sampleClass s = new sampleClass(50,k);		
		System.out.println(s.num);				
		System.out.println((s.n).a);				
		sampleClass sNew = copySample(s);
		System.out.println(sNew.num + " " + (sNew.n).a);		
		sampleClass sCloned = s.toObject().clone();
		System.out.println(sCloned.num + " " + (sCloned.n).a);		
	}		
}
