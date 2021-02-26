package dotcpp;

import java.util.Scanner;

public class 时间转换 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int h = t / 3600;
		t %= 3600;
		int m = t / 60;
		t %= 60;
		System.out.println(String.format("%s:%s:%s",h,m,t));
	}

}
