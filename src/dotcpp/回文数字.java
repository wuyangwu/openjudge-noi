package dotcpp;

import java.util.Scanner;

public class 回文数字 {
	
	static boolean zhi(int n,int m) {
		int sum = 0;
		int[] number = new int[7];
		int count =0;
		while (m!=0) {
			sum += m%10;
			number[count++] = m%10;
			m /=10;
		}
		if (sum == n) {
			for (int i = 0; i < count/2; i++) {
				if (number[i] != number[count-i-1]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = 0;
		for (int i = 10000; i < 1000000; i++) {
			if (zhi(n, i)) {
				k=1;
				System.out.println(i);
			}
		}
		if (k==0) {
			System.out.println("-1");
		}
	}

}
