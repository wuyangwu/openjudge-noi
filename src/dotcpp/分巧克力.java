package dotcpp;

import java.util.Scanner;

public class 分巧克力 {
	static int n =0;
	static int k = 0;
	// c为要分的巧克力
	static boolean find(int c , int number[][]){
		int sum =0;
		for (int i = 0; i < number.length; i++) {
			int k = number[i][0]/c;
			int n = number[i][1]/c;
			sum += n*k;
		}
		
		if (sum>=k) {
			return true; // 可能正好，也可能是切的小了导致切了很多快
		}
		return false; //切的多了导致少了
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		 k = scanner.nextInt();
		int[][] number = new int[n][2];
		int mlength =0;
		for (int i = 0; i < n; i++) {
			number[i][0] = scanner.nextInt();
			number[i][1] = scanner.nextInt();
			if (number[i][0]*number[i][1]>mlength) {
				mlength = number[i][0]*number[i][1];
			}
		}
		int j = 0;
		int center = 0;
		int ans =0;
		while (j<=mlength) {
			center = j + (mlength-j)/2;
			if (find(center, number)) {
				j = center+1;
				ans = center;
			}else {
				mlength = center-1;
			}
		}
		System.out.println(ans);
	}
}
