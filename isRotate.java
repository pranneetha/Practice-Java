public class isRotate{
	public static void main(String[] args){
		String s1 = args[0];
		String s2 = args[1];
		if(s1.length() != s2.length())
			System.out.println("False");
		else{
			String s = s2.concat(s2);
			System.out.println(s);
			if(s.contains(s1)){
				System.out.println("True");	
			}
			else
				System.out.println("False");
		}

	}	
}
