package 蓝桥杯2015;

import java.util.Scanner;

public class _09垒骰子 {
	static int n,m;
	static int[][] biaoji = new int[7][7];
	static int[] saizi = new int[7];
	
	static int dfs(int c, int b) {
		if (c == n) {
			return 4;
		}
		
		int ans = 0;
		for (int i = 1; i <=6; i++) {
			if (biaoji[b][i] == 0) {
			  ans += dfs(c+1, saizi[i]);
			}
		}
		return ans;
	}
	static void  init() {
		saizi[1] = 4;
		saizi[4] = 1;
		saizi[2] = 5;
		saizi[5] = 2;
		saizi[3] = 6;
		saizi[6] = 3;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		init();
		for (int i = 0; i <m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			biaoji[a][b] =1;
			biaoji[b][a] = 1;
		}
		int sum = 0;
//		System.out.println(dfs(0, 0));
		for (int i = 1; i <=6; i++) {
			sum += 4*dfs(1, i);
		}
		System.out.println(sum);
	}

}
