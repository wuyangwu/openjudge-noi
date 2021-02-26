package dotcpp;

import java.util.Scanner;

public class Tom数 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String numbers = scanner.next();
			int number = 0;
			for (int i = 0; i < numbers.length(); i++) {
				number += numbers.charAt(i)-'0';
			}
			System.out.println(number);
		}
	}

}
