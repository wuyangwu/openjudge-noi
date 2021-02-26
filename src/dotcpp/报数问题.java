package dotcpp;

import java.util.Scanner;

public class 报数问题 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), s =0;
		boolean[] m = new boolean[n+1];
		for (int i = 0; i < n; i++) { // 要出隊n次
			for (int  j= 0;  j<3; j++) {
				if (++s>n) {
					s = 1;
				}
				if (m[s]) {
					j--;
				}
			}
			 m[s]=true;//输出，记录已出队
		}
		System.out.println(s);
	}

}
