package dotcpp;

import java.util.Scanner;

public class 一元一次方程 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		b = -b;
		System.out.println(String.format("%.2f", b/a));
	}

}
