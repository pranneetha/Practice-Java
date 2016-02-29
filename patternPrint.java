public class patternPrint{

	public static void countAndSay(int num,int n) {
        if(n == 0)
            return;
        int i = 0,j = 0,count = 0;
        String s = "";
        String temp;String str;char c;
        s = String.valueOf(num);
	for(i = 1;i < n;i++){
		temp = "";
	        count = 0;c = s.charAt(0);
            	for(j = 1;j < s.length();j++){
                	if(s.charAt(j) != c){
                    		str = String.valueOf(count+1);
                    		temp = temp + str + c;
                    		count = 0;
                    		c = s.charAt(j);
                	}
                else
                    count++;
            	}
		str = String.valueOf(count+1);
		temp = temp + str+ c;
		s = temp;
        }
        
        System.out.println(s);
	return;
    	}


	public static void main(String[] args){
		countAndSay(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
	}
}
