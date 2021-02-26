package dotcpp;

import java.util.Scanner;

public class Stamps邮票问题 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();// 信封上贴k张邮票
		int n = scanner.nextInt(); // 邮票的面值
		int[] ns = new int[n];
		for (int i = 0; i < n; i++) {
			ns[i] = scanner.nextInt();
		}
		int[] a = new int[10000];
		a[0] = 0;
		for (int i = 1; i < 10000; i++) {
			a[i] = 50000;
		}
		for (int i = 0; i < n; i++) { // 多少种邮票
			for (int j = ns[i]; j <=ns[i]*k; j++) {
				a[j] = Math.min(a[j],a[j-ns[i]]+1 );
			}
		}
		int i = 1;
		for ( ;i < 10000; i++) {
			if (a[i]>k) {
				break;
			}
		}
		System.out.println(i-1);
	}

}
