import java.util.Scanner;


public class intern {
	private static int[] passes;
	private static int[] calc_passes(int[] scores, int levels)
	{
		int curr_level = levels-1, i = 0, curr_index = scores.length-levels-1;
		int []temp_scores = scores.clone();
		while(curr_level >= 0)
		{
			i = 1;
			while(i <= curr_level)
			{
				if(temp_scores[curr_index+curr_level] > temp_scores[curr_index+curr_level+1])
				{
					passes[curr_index] = curr_index+curr_level;
					temp_scores[curr_index] = temp_scores[curr_index] + temp_scores[curr_index+curr_level];
				}
				else
				{
					passes[curr_index] = curr_index + curr_level+1;
					temp_scores[curr_index] = temp_scores[curr_index] + temp_scores[curr_index+curr_level+1];
				}
				curr_index--;
				i++;
			}
			curr_level--;
		}
		//for(i = 0;i < scores.length;i++)
			//System.out.println(temp_scores[i]);
		return passes;
	}
	public static void main(String[] args)
	{
		int levels; String[] temp_arg;
		Scanner in = new Scanner(System.in);
		levels = Integer.parseInt(in.nextLine());
		int []scores = new int[((levels)*(levels+1))/2];int i = 1,j = 0,count = 0;
		while(i < levels+1)
		{
			temp_arg = (in.nextLine().trim()).split("\\s+");j = 0;
			//System.out.println(temp_arg[0]);
			while(j < i)
			{
				scores[count] = Integer.parseInt(temp_arg[j]);
				j++;
				count++;
			}
			i++;
		}
		//for(i = 0;i < scores.length;i++)
		//System.out.println(scores[i]);
		passes = new int[scores.length]; 
		passes = calc_passes(scores,levels);
		//for(i = 0;i < scores.length;i++)
			//System.out.println(passes[i]);
		int ans = scores[0];i = 0;int index =0;
		while(i <levels-1)
		{
			ans = ans + scores[passes[index]];
			index = passes[index];
			i++;
		}
		System.out.println(ans);
		
	}
