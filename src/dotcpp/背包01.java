package dotcpp;

import java.util.Scanner;

public class 背包01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] w = new int[n+1]; // 重量
		int[] v = new int[n+1]; // 价值
		for (int i = 1; i <=n; i++) {
			w[i] = scanner.nextInt();
			v[i] = scanner.nextInt();
		}
		int[][] number = new int[n+1][m+1];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=m; j++) {
				// 背包能放下容量
				if (j>=w[i]) {
					// 则拿物体的价值+背包减去物体容量剩下能放下去的价值和 物体的上一个最优解比较
					number[i][j] = Math.max(v[i]+number[i-1][j-w[i]], number[i-1][j]);
				}else {
					// 物体超过物体需要的容量则用上一个最优的
					number[i][j] = number[i-1][j];
				}
			}
		}
		System.out.print(number[n][m]);
	}

}
