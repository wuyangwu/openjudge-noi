package dotcpp;

import java.util.Scanner;

public class 夺宝奇兵 {
	
	static int n;
	
	static int[][] b = new int[5][5];
	
	static int dfs(int i, int j, int nu[][]) {
		if(i == n-1) {
			return nu[i][j];
		}
		if(b[i][j] !=0) {
			return nu[i][j];
		}
	
		//两个方向走
		int x = dfs(i+1, j, nu); // 向下移动一位
		int y = dfs(i+1, j+1, nu); // 向右下移动一位
		b[i][j] =nu[i][j]+ Math.max(x, y); // 于最大的一个向加
		return b[i][j];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		int[][] nu = new int[n][n];
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <=i; j++) {
				nu[i][j] = scanner.nextInt();
			}
		}
		// 递归+记忆搜索
		System.out.println(dfs(0, 0, nu));
		/*
		 * for (int i = n-2; i>=0; i--) { for (int j = 0; j <=i; j++) { nu[i][j] =
		 * Math.max(nu[i+1][j], nu[i+1][j+1])+nu[i][j]; } }
		 * System.out.println(nu[0][0]);
		 */
	}
}
