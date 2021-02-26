package dotcpp;

import java.util.Scanner;

public class 传染病控制 {
	 // 正确率82%
	static int n;
	static int p;
	static int[] biaoji =new int[400];
	static int min = 99999999;

	static void dfs(int m ,int mx ,int nu[][]) {
		
		for (int i = m; i < p; i++) {
			if (mx == nu[i][0]&&biaoji[nu[i][1]] == 0) {
				biaoji[nu[i][1]] = 1;
				dfs(m+1, nu[i][1], nu);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		 p = scanner.nextInt();
		int[][] nu = new int[p][2];
		for (int i = 0; i <p; i++) {
			nu[i][0] = scanner.nextInt();
			nu[i][1] = scanner.nextInt();
		}
		
		for(int i = 0; i < p; i++) {
			if (nu[i][0] == 1) {
				biaoji[nu[i][0]] =1; 
				biaoji[nu[i][1]] = 1;
				dfs(0,nu[i][1],nu);
				int sum = 0;
				for (int j = 0; j < n; j++) {
					if(biaoji[j] == 1) {
						sum++;
					}
				}
				min = Math.min(min, sum);
				biaoji = new int[400];
			}
		}
		System.out.println(min);
	}
}
