//Problem        : How fast can news go
//Language       : Java
//Compiled Using : javac
//Version        : Java 1.7.0_75
//Input for your program will be provided from STDIN
//Print out all output from your program to STDOUT

import java.util.Scanner;
import java.util.*;
import java.util.Queue;
//Your submission should *ONLY* use the following class name
public class Problem
{
    public static void main(String[] args)
    {
	String inp;
	Queue<Integer> Q = new LinkedList<Integer>();
       Scanner stdin = new Scanner(System.in);int i = 0, j = 0;
	inp = stdin.nextLine();
	int n = Integer.parseInt(inp);
	inp = stdin.nextLine();
	int k = Integer.parseInt(inp);
	inp = stdin.nextLine();
	int t = Integer.parseInt(inp);
	int count = 0;
	int time = 0;
	int[] timer = new int[n+1];
	while(true)	
	{
		Q.add(i);
		timer[i] = time;	
		count++;
		if(count== n)
			break;
		if((timer[Q.peek()]+t)%t == 0)
		{
			Q.remove();
			count++;
			Q.add(i);
			timer[i] = time;	
			i++;
		}	
		time++;			
		if(count == n)
			break;
	}	
       stdin.close();
	System.out.println(time);
    }

}//Probl
