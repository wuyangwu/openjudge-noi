package 蓝桥杯真题._2013;

import java.util.Scanner;

public class _10练号区间 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n+1];
		for (int i = 1; i <=n; i++) {
			num[i] = scanner.nextInt();
		}
		int ans = 0;
		for (int i = 1; i <=n; i++) {
			int max = num[i];
			int min = num[i];
			for(int j =1 ;j <=n;j++) {
				if (i == j) {
					ans++;
				}else {
					if (max<num[j]) {
						max = num[j];
					}else {
						if (min > num[j]) {
							min = num[j];
						}
					}
					
					if (max -min == j-i) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
