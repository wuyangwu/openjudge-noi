package dotcpp;

import java.util.Scanner;

public class 数的统计 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), max = 0;
		int[] nu = new int[1000001];
		for (int i = 0; i <n; i++) {
			int j = scanner.nextInt();
			nu[j]++;
			if (j>max) {
				max = j;
			}
		}
		
		for (int i = 1; i <=max; i++) {
			if (nu[i]>0) {
				System.out.println(i+" "+nu[i]);
			}
		}

	}

}
