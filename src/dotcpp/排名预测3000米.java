package dotcpp;

import java.util.Scanner;

public class 排名预测3000米 {
	static int n = 0; // n个运动员
	static int m = 0; // m个围观观众
	static int count= 0; 
	static int[][] a = new int[15][15]; // 存观众预测的结果
	static int[] biaoji = new int[10];  // 排名是否被使用了
	static int[] number = new int[10];
	static int[][] answer =new int[2000][11]; // 结果集
	
	
	static boolean jianzhi() {
		for (int i = 0; i < m; i++) {
			int x = 1, y =0;
			if (a[i][a[i][0]+1] == 1) { // 条件为真
				for (int j = 0; j < n; j++) {
					if (number[j] == a[i][x]) {
						x++;
						y++;
					}
				}
				if (y<a[i][0]) { 
					return false;
				}
			}else { // 条件位假
				for (int j = 0; j < n; j++) {
					if (number[j] == a[i][x]) {
						x++;
						y++;
					}
				}
				if (y>=a[i][0]) { 
					return false;
				}
			}
		}
		return true;
	}
	
	static void dfs(int d) {
		if (d == n) {
			if (jianzhi()) {
				for(int i = 0; i < n ;i++) {
					answer[count][i] = number[i];
				}
				count++;
			}
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (biaoji[i] == 0) {
				biaoji[i] = 1;
				number[d] = i;
				dfs(d+1);
				biaoji[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			a[i][0] = scanner.nextInt();
			int j = 1;
			for ( ;j <a[i][0]+2 ; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		dfs(0);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}

}
