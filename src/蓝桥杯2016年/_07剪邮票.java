package 蓝桥杯2016年;

public class _07剪邮票 {
	
	static int[] biaoji = new int[12];
	static int[] a = {0,0,0,0,0,0,0,1,1,1,1,1};
	static int[] a1 = new int[12];
	static int sum = 0;

	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static void dfss(int b[][], int x, int y) {
		
		 b[x][y] = 0;
		for (int i = 0; i < 4; i++) {
			int dxx = x+ dx[i];
			int dyy = y+ dy[i];
			if (dxx>=0&&dxx<=2&&dyy>=0&&dyy<=3&&b[dxx][dyy]==1) {
				dfss(b,dxx,dyy);
			}
		}
	}
	
	static  boolean check() {
		int[][] b = new int[3][4];
		for (int i = 0; i < 12; i++) {
			if (a1[i]!=0) {
				b[i/4][i%4] = 1;
			}
		}
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (b[i][j] == 1) {
					dfss(b,i,j);
					ans++;
				}
			}
		}
		if (ans == 1) {
			return true;
		}
		return false;
	}
	
	static void dfs(int n) {
		if (n == 12) {
			if (check()) {
				sum++;
			}
		}
		for (int i = 0; i < 12; i++) {
			if (i>0&&a[i]== a[i-1]&&biaoji[i-1]==0) continue; // 去重复
			if (biaoji[i] == 0) {
				biaoji[i] = 1;
				a1[n] = a[i];
				dfs(n+1);
				biaoji[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		dfs(0);
		System.out.println(sum);
		// 答案116
	}

}
