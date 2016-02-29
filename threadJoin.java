import java.util.*;
public class threadJoin{
	private static int count = 0;
	public static void main(String[] args){
		int i = 0;
		Thread t1 = new Thread(new Runnable{
			public void run(){
				for(int i = 0;i < 10000;i++)
				count++;	
			}
		});			
		Thread t1 = new Thread(new Runnable{
			public void run(){
				for(int j =0;j < 10000;j++)
				count--;
			}
		}):
		t1.start();
		t2.start();
		System.out.println(count);
			
	}		 	
}
