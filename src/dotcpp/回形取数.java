package dotcpp;

import java.util.Scanner;

public class 回形取数 {
// 这题目要背
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] number = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				number[i][j] = scanner.nextInt();
			}
		}
	}

}
