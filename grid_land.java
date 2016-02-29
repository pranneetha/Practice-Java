import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class grid_land{

static String[] gridLand(String[] inp) {
        int i = 0,j = 0, k = 0, test = 0, l = 0, k_count = 0, x = 0, y = 0, index = 0;char temp;
        String[] dummy_args = new String[3];
        String[] fin_ans = new String[inp.length];
        char[] char_inp;
        for(test = 0;test < inp.length;test++)
            {
	//	System.out.println(test);
            dummy_args = inp[test].split(" ");
            x = Integer.parseInt(dummy_args[0]);
            y = Integer.parseInt(dummy_args[1]);
            k = Integer.parseInt(dummy_args[2]);
            l = x+y;
            char_inp = new char[x+y];
            for(i = 0; i < x;i++)
                char_inp[i] = 'H';
            for(;i < x+y;i++)
                char_inp[i] = 'V';
            k_count=1;
		if(k == 0){
		fin_ans[test] = char_inp.toString();continue;}
            while(true)
                {
            for(i = l-2;i >= 0; i--)
                {
                if(char_inp[i] < char_inp[i+1]) break;
            }
            if(i < 0){fin_ans[test] = null;
                break;}
            else{
                
            index = i+1;
            for(j = index+1;j < l;j++)
                {
                if(char_inp[j] < char_inp[index] && char_inp[j] > char_inp[i])
                    index = j;
            }
            temp = char_inp[i];
            char_inp[i] = char_inp[index];
            char_inp[index]=temp;
	    Arrays.sort(char_inp,i+1,l);
                if(k_count == k)
                    {
                    fin_ans[test] = new String(char_inp);
			System.out.println(fin_ans[test]);
                    break;
                }
                k_count++;
            }
            }
        }
        return fin_ans;
    }
public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
    //    final String fileName = System.getenv("OUTPUT_PATH");
      //  BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        
        int _inp_size = Integer.parseInt(in.nextLine());
        String[] _inp = new String[_inp_size];
        String _inp_item;
        for(int _inp_i = 0; _inp_i < _inp_size; _inp_i++) {
            try {
                _inp_item = in.nextLine();
            } catch (Exception e) {
                _inp_item = null;
            }
            _inp[_inp_i] = _inp_item;
        }
        
        res = gridLand(_inp);
        //for(int res_i=0; res_i < res.length; res_i++) {
          //  bw.write(String.valueOf(res[res_i]));
          //  bw.newLine();
        //}
        
        //bw.close();
    }
}
