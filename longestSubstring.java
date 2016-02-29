class longestSubstring{

	static int index;
	private static int find_longest(String s1, String s2)
	{
		int i = 0, j = 0;
		int s1_length = s1.length();
		int s2_length = s2.length();
		int [][]note = new int[s1_length+1][s2_length+1];
		int maximum = Integer.MIN_VALUE;
		for(i = 0;i < s1_length+1;i++)
		{
			for(j = 0;j < s2_length + 1;j++)
			{
				if(i == 0 || j == 0)
				{
					note[i][j] = 0;
					continue;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1))
				{
					note[i][j] = note[i-1][j-1] + 1;
					if(note[i][j] > maximum)
					{
						maximum = note[i][j];
						index = i;	
					}
				}
				else
				{
					note[i][j] = 0;
				}	
			}
		}
		return maximum;	
	}
	public static void main(String[] args){
		int i = 0;
		String s1, s2;
		s1= args[0];
		s2 = args[1];
		int length_longest = find_longest(s1,s2);
		System.out.println(length_longest);	
		System.out.println(index);	
	}
}
