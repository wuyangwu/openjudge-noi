package dotcpp;

import java.util.Scanner;

public class 核桃的数量 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = Math.max(a, b);
		 max = Math.max(max, c);
		 for (int i = max; i <=a*b*c ; i++) {
			if (i%a==0&&i%b==0&&i%c==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
