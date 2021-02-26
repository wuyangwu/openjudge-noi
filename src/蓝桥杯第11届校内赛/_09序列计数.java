package 蓝桥杯第11届校内赛;

import java.util.Scanner;

public class _09序列计数 {
	static int[][] num = new int[11][11];
	static int dfs(int i, int n) {
		if (num[i][n] != 0) {
			return num[i][n];
		}
		int ans =1;
		for (int j = 1; j <n; j++) {
			ans += dfs(j,Math.abs(i-j));
			ans %= 10000;
		}
		num[i][n] = ans;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		for (int i = 1; i <= n; i++) {
//			System.out.print(dfs(i,Math.abs(n-i)));
			ans = ans+ dfs(i,Math.abs(n-i));
			ans %=10000;
		}
		System.out.println(ans);
		
	}

}
