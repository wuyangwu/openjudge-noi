package dotcpp;

import java.util.Scanner;

public class 连号区间数 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int  n = scanner.nextInt();
		int[] numebr =new int[n];
		for(int i = 0; i < n;i++) {
			numebr[i] = scanner.nextInt();
		}
		int sum =0,max=0,min=0;
		for (int i = 0; i < n; i++) {
			max = min = numebr[i];
			for (int j = i; j < n; j++) {
				max = Math.max(max, numebr[j]);
				min = Math.min(min, numebr[j]);
				if (max-min == j-i) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
