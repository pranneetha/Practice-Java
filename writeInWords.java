import java.util.*;
public class writeInWords{
	private static void printWords(int n){
		List<String> ans = new ArrayList<String>();
		Map<Integer,String> ones = new HashMap<Integer,String>();
		Map<Integer,String> tens = new HashMap<Integer,String>();
		Map<Integer,String> denom = new HashMap<Integer,String>();

		denom.put(1,"Thousand");denom.put(2,"Million");denom.put(3,"Zillion");
		
		ones.put(1,"One");ones.put(2,"Two");ones.put(3,"Three");ones.put(4,"Four");ones.put(0,"");
		ones.put(5,"Five");ones.put(6,"Six");ones.put(7,"Seven");ones.put(8,"Eight");ones.put(9,"Nine");

		tens.put(2,"Twenty");tens.put(3,"Thirty");tens.put(4,"Forty");tens.put(5,"Fifty");tens.put(6,"Sixty");tens.put(0,"");
		tens.put(7,"Seventy");tens.put(8,"Eighty");tens.put(9,"Ninety");tens.put(10,"Ten");tens.put(12,"Eleven");tens.put(11,"Eleven");
		tens.put(12,"Twelve");tens.put(13,"Thirteen");tens.put(14,"Fouteen");tens.put(15,"Fifteen");tens.put(16,"Sixteen");tens.put(17,"Seventeen");
		tens.put(18,"Eighteen");tens.put(19,"Nineteen");
		int i =0, j = 0,curr,num;
		while(n!=0){
			curr = n%10;
			n = n/10;
			if(j > 0 && j%3 == 0){
				i++;
				ans.add(0,denom.get(i));
			}
			if(j%3 == 0){
				if(n%10 == 1){
					num = 10 + curr;
					ans.add(0,tens.get(num));
					n = n/10;
					j++;		
				}
				else{
					ans.add(0,ones.get(curr));
				}	
			}
			else if(j%3 == 1){
			
				ans.add(0,tens.get(curr));
			}
			else if(j%3 == 2){
				if(curr != 0){
					ans.add(0,"Hundred");
					ans.add(0,ones.get(curr));
				}
			}
			j++;
		}
			
		for(i = 0;i < ans.size();i++){
			System.out.print(ans.get(i) + " ");
		}	
		System.out.println();	
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);	
		printWords(n);
	}
}
