package dotcpp;

import java.util.Scanner;


public class 矩阵乘法 {
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] c = new int[n][n];
		for (int i = 0; i < n; i++) {
			for(int j = 0; j< n; j++) {
				a[i][j] = scanner.nextInt();
				b[i][j] = a[i][j];
			}
		}
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i==j) {
						System.out.print(1+" ");
					}else {
						System.out.print(0+" ");
					}
				}
				System.out.println();
			}
			System.exit(0);
		}
		if (m>1) {
			while (--m!=0) {
					for(int j = 0 ;j< n; j++) {
						for(int k = 0; k < n; k++) {
							for (int c1 = 0; c1 < n; c1++) {
								c[j][k] += a[j][c1]*b[c1][k];
							}
						}
					}
					for (int j = 0; j < n; j++) {
						for (int k = 0; k < n; k++) {
							a[j][k] = c[j][k];
							c[j][k] = 0;
						}
					}
				}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
