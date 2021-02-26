package dotcpp;

import java.util.Scanner;

public class 格子刷油漆 {
	// 超時間83%
	static int sum=0;
	static int n =0;
	static int dx[] = {-1,-1,-1,0,0,1,1,1};// 左上，上，右上，左，右，左下，下，右下
	static int dy[] = {-1,0,1,-1,1,-1,0,1};
	static void dfs(int x, int y, int m,int biaoji[][]) {
		if (m == 2*n-1) {
			sum++;
			sum %=1000000007;
			return;
		}
		for (int i = 0; i < 8; i++) {
			int dxx = dx[i]+x;
			int dyy = dy[i]+y;
			if (dxx<0||dxx>=2||dyy<0||dyy>=n) {
				continue;
			}
			if (biaoji[dxx][dyy] == 0) {
				biaoji[dxx][dyy] =1;
				dfs(dxx, dyy, m+1, biaoji);
				biaoji[dxx][dyy] = 0;
			}
				
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		int[][] biaoji = new int[2][n];
		for (int i = 0; i <2; i++) {
			for (int j = 0; j <n; j++) {
				biaoji[i][j] = 1;
				dfs(i, j, 0, biaoji);
				biaoji[i][j] = 0;
			}
		}
		System.out.print(sum);
		
	}

}
