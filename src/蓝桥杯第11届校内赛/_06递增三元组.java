package 蓝桥杯第11届校内赛;

import java.util.Scanner;

public class _06递增三元组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 1; i < n-1; i++) {
		
			int j = 0;
			for (; j <i; j++) {
				if (a[i]>a[j]) {
					break;
				}
			}
			if (j!=i) {
				int j2 = i+1;
				for (; j2 <n; j2++) {
					if (a[j2]>a[i]) {
						break;
					}
				}
				if (j2!=n) {
					sum++;
				}
				
			}
		}
		System.out.println(sum);
	}

}
