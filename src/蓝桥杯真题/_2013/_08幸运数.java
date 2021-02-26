package 蓝桥杯真题._2013;

import java.util.Scanner;

public class _08幸运数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt(), sum = 0;
		int[] number = new int[n+1];
		for (int i =2; i < n+1; i++) { // 要移动多少次
			if (number[i] == 0) {
				int k = 0;
				int s = 1;
				for (int j = 1; j*i < n+1; j++) {//
					while (s< n+1) {
						if (number[s] == 0) {
							k++;
						}
						if (k == i*j) {
							break;
						}
						s++;
					}
					if (s<n+1) {
						number[s] = 1; 
					}
				}
			}
		}
		
		for (int i = m+1; i < n; i++) {
			if (number[i] == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
