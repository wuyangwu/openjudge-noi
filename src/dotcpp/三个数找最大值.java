package dotcpp;

import java.util.Scanner;

public class 三个数找最大值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = Math.max(a, b);
		max = Math.max(max, c);
		System.out.println(max);
	}

}
