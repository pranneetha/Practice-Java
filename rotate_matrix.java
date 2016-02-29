import java.util.*;
public class rotate_matrix{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int n = Integer.parseInt(inp.nextLine()),i = 0,j = 0;	
		int[][] arr = new int[n][n];int temp = 0;
		String[] s;
		for(i = 0;i < n;i++){
			s = inp.nextLine().split(" ");
			for(j = 0;j < n;j++){
				arr[i][j] = Integer.parseInt(s[j]);
			}	
		}	
		for(i = n;i > n/2;i--){
			for(j = 0;j < 2*i-n-1;j++){
				temp = arr[n-i][j + n - i];
				arr[n-i][j + n - i] = arr[i-j-1][n-i];
				arr[i-j-1][n-i] = arr[i-1][i-j-1];
				arr[i-1][i-j-1] = arr[j + n - i][i-1];
				arr[j+n-i][i-1] = temp;
			}
			for(int k = 0;k < n;k++){
                        for(int l = 0;l < n;l++){
                                System.out.print(arr[k][l] + " ");
                        }
                        System.out.println();
                }
		}
		/*for(i = 0;i < n;i++){
			for(j = 0;j < n;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} */
	}
}
