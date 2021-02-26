package dotcpp;

import java.util.Scanner;

public class 字符串对比 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mString = scanner.next();
		String nString = scanner.next();
		if (mString.length()!=nString.length()) {
			System.out.println(1);
		}else {
			if (mString.compareTo(nString)==0) {
				System.out.println(2);
			}else {
				if (mString.compareToIgnoreCase(nString) == 0) {
					System.out.println(3);
				}else {
					System.out.println(4);
				}
			}
		}
	}
}
