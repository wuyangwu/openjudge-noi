package 蓝桥杯2014;

import java.util.Scanner;

public class _09地宫取宝 {
	static int n,m,k;
	static int[][][][] a = new int[55][55][15][15];
	static int[][] num = new int[55][55];
	 static int mod = 1000000007;//取余值
	static int dfs(int i, int j, int l , int max) {
		if (i==n||j==m) {
			return 0;
		}
		
		if (a[i][j][l][max+1]!=-1) {	
			return a[i][j][l][max+1];
		}
		int sum = 0;
		if (i == n-1&&j == m-1) {
			if (l == k||l == k-1&&num[i][j]>max) {
				return 1;
			}else {
				return 0;
			}
			
		}
		
		if (num[i][j] >max) {
			sum += dfs(i+1, j, l+1, num[i][j]);
			sum %= mod;
		}
		sum += dfs(i+1, j, l, max);
		sum %= mod;
		
		if (num[i][j] >max) {
			sum += dfs(i, j+1, l+1, num[i][j]);
			sum %= mod;
		}
		sum += dfs(i, j+1, l,max);
		sum %= mod;
		a[i][j][l][max+1] = sum;
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		k = scanner.nextInt();
		for(int i =0 ;i< n; i++) {
			for(int j =0; j< m;j++) {
				num[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < 55; i++) {
			for (int j = 0; j < 55; j++) {
				for (int j2 = 0; j2 < 15; j2++) {
					for (int k = 0; k < 15; k++) {
						a[i][j][j2][k] = -1;
					}
				}
			}
		}
		System.out.println(dfs(0, 0, 0, -1));
		
	}
}
