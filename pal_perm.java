import java.util.*;
public class pal_perm{
	private static int get_value(char c){	
		int c_val = (int)c;
		int a = (int)'a';
		int z = (int)'z';
		int A = (int)'A';
		int Z = (int)'Z';
		if(c_val >= a && c_val <= z){
			return (c_val-a);	
		}
		if(c_val >= A && c_val <= Z){
			return (c_val-A);
		}
		return -1;	
			
	}
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);		
		String input = inp.nextLine();	int i = 0, bit_vector = 0, value;
		for(i = 0;i < input.length();i++){
			value = get_value(input.charAt(i));
			if(value != -1)
				bit_vector = bit_vector	^ (1 << value);	
		}	
		System.out.println(bit_vector);	
		if(bit_vector == 0 || (bit_vector&(bit_vector-1))==0)
			System.out.println("Yes");		
		else
			System.out.println("No");
	}	
}
