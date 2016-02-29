import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class subseq
{
    static String[] buildSubsets(String s) {
       
        ArrayList<String> ans_set = new ArrayList<String>();
        ArrayList<String> curr_arr_list = new ArrayList<String>();
        Map<Integer,ArrayList<String>> s_map = new HashMap<Integer,ArrayList<String>>();
        int total_count = 0,i = 0,j = 0;
        int s_size = s.length(), k = 0;
        String s_sub, s_dum;
	ArrayList<String> dummy = new ArrayList<String>();
        for(i = 0;i < s_size;i++)
            {
            s_map.put(i,new ArrayList<String>());
        }
	dummy = s_map.get(0);
	dummy.add(s.substring(0,1));
	ans_set.add(s.substring(0,1));
	for(i = 1;i < s_size;i++)
	{
		dummy = s_map.get(i);
		dummy.add(s.substring(i,i+1));	
		ans_set.add(s.substring(i,i+1));	
		for(j = 0;j < i;j++)
		{
			dummy = s_map.get(j);
		//	System.out.println("inside second for");
		//	System.out.println(j);
			for(k = 0;k < dummy.size();k++) // getting each of the elements of the arrayList corresponding to index j
			{
				s_dum = dummy.get(k) + s.charAt(i);
		//		System.out.println(s_dum);
				curr_arr_list = s_map.get(i);
				if(!dummy.contains(s_dum))
				{
						
					curr_arr_list.add(s_dum);
					if(!ans_set.contains(s_dum))
					{
						ans_set.add(s_dum);
						//System.out.println(s_dum);
					}
				}	
			}	
		}
	}
	String[] final_ans_array = ans_set.toArray(new String[ans_set.size()]);
	Arrays.sort(final_ans_array);
	return final_ans_array;
	
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        //final String fileName = System.getenv("OUTPUT_PATH");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }
        
        res = buildSubsets(_s);
        //for(int res_i=0; res_i < res.length; res_i++) {
        //    bw.write(String.valueOf(res[res_i]));
        //    bw.newLine();
        //}
        
        //bw.close();
    }
}
