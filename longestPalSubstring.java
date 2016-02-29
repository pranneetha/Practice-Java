public class longestPalSubstring{
    public static String longestPalindrome(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];int i = 0,max= 1,j = 0,l=0,max_i = 0,max_j = 0;
        for(i = 0;i < len-1;i++){
            dp[i][i] = 1;
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = 1;
                max = 2;
            }
            else
                dp[i][i+1] = 0;
        }
        for(l = 3;l <= len;l++){ // for length of the substring
            for(i = 0;i < len-l+1;i++){
                j = i+l-1;
                if((s.charAt(i) == s.charAt(j)) && dp[i+1][j-1] == 1){
                    dp[i][j] = 1;
                    max = l;
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(s.substring(max_i,max_j+1));
        return s.substring(max_i,max_j+1);
    }
	public static void main(String[] args){
		System.out.println(longestPalindrome(args[0]).length());	
	
	}
}
