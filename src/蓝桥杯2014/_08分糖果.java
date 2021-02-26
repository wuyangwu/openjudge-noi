package 蓝桥杯2014;

import java.util.Scanner;

public class _08分糖果 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		int count =0;
		while (true) {
		
			int c = num[0]/2;
			for (int k = 0; k <n-1; k++) {
				num[k] = num[k]/2+num[k+1]/2;
			}
			num[n-1] = num[n-1]/2+c;
			
			for (int k = 0; k < n; k++) {
				if (num[k]%2 == 1) {
					num[k] += 1;
					count++;
				}
			}
			
			int i =0,j =1;
			for ( ; j<n;j++) {
				if (num[j] != num[i]) {
					break;
				}
			}
			if (j == n) {
				break;
			}
		}
		System.out.println(count);
	}

}
