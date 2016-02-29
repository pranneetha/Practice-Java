public class passbyref1{
	private static void add(String i)
	{
		i = i + "1";
		System.out.println(i);	
	}
	public static void main(String[] args)
	{
		String i = "Asdsd";
		add(i);
		System.out.println(i);	
	}
}
