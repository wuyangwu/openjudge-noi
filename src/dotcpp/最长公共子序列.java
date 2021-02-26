package dotcpp;

import java.util.Scanner;

public class 最长公共子序列 {
	// 非连续

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String aString = scanner.next();
		String bString = scanner.next();
		int max = 0;
		int[][] num = new int[aString.length()+1][bString.length()+1];
		for (int i = 1; i <=aString.length(); i++) {
			for (int j = 1; j <= bString.length(); j++) {
				if (aString.charAt(i-1) == bString.charAt(j-1)) {
					num[i][j] = num[i-1][j-1]+1;
				
				}else {
					num[i][j] = Math.max(num[i-1][j], num[i][j-1]);
				}
			}
		}
		System.out.println(num[aString.length()][bString.length()]);
	}

}
