import java.util.*;
public class reverseNumString{
	private static String rip(String str){
		int size = str.length();char prev = ' ',curr = str.charAt(0);
		int i = 0,j = 0,flag = 0;
		String modStr = "";
		while(j < size){
			curr = str.charAt(j);
			if(curr != ' ' && prev == ' '){
				if(flag == 1){
					modStr = modStr + prev + curr;	
				}
				else{
					modStr = modStr + curr;
					flag = 1;
				}	
			}
			else if(curr !=  ' '){
				modStr= modStr + curr;	
			}
			prev = curr;
			j++;
		}
		return modStr;
	}
	private static String reverse(String str){
		int size = str.length(), i = 0,flag = 0; 	
		String newStr = "";
		for(i = size-1;i >= 0;i--){
			if(flag == 0 && str.charAt(i) != '0'){
				newStr = newStr + str.charAt(i);	
				flag = 1;
			}
			else if(flag  == 1){
				newStr = newStr +str.charAt(i);
			} 
		}	
		return newStr;	
	}
	public static void main(String[] args){
		String str = "       I am not going to do      that!    ";
		String res = reverse(str);
		String modStr = rip(str);	
		System.out.println(modStr + "b");	
	}	
}
