public class passbyref{
	private static void add(int[] i)
	{
		i[0] = i[0] + 1;
		System.out.println(i[0]);	
	}
	public static void main(String[] args)
	{
		int[] i = new int[1];
		i[0] = 0;
		add(i);
		System.out.println(i[0]);	
	}
}
