package 蓝桥杯2015;

import java.util.Scanner;

public class _08饮料换购 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = n;
		while (n>=3) {
			int m = n/3;
			sum += m;
			 m += n%3;
			 n =m;
		}
		System.out.println(sum);
	}
}
