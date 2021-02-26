package dotcpp;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 装箱问题 {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(new BufferedInputStream(System.in));
		int n = scanner.nextInt();
		int v = scanner.nextInt();
		int[] vh = new int[v];
		int[][] a = new int[v+1][n+1];
		for (int i = 0; i <v; i++) {
			vh[i] = scanner.nextInt();
		}
		for(int i = 1; i<=v; i++) {
			for (int j = 1; j <=n; j++) {
				if (j >= vh[i-1]) {// 箱子能放下物品
					a[i][j] = Math.max(vh[i-1]+a[i-1][j-vh[i-1]], a[i-1][j]);
				}else { // 箱子放不下物品
					a[i][j] = a[i-1][j];
				}
			}
		}
		System.out.println((n-a[v][n]));
	}
}
