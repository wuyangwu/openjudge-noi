package dotcpp;

import java.util.Scanner;


public class 弟弟的作业 {
	static boolean add(String number) {
		String[] bStrings = number.trim().split("\\+");
		if (bStrings.length == 1) {
			bStrings = number.trim().split("\\-");
		}
		String[] aStrings = bStrings[1].trim().split("\\=");
		for (int i = 0; i < aStrings[1].length(); i++) {
			if (aStrings[1].charAt(i)<'0'||aStrings[1].charAt(i)>'9') {
				return false;
			}
		}
		if ((Integer.parseInt(bStrings[0])+Integer.parseInt(aStrings[0])== Integer.parseInt(aStrings[1]))) {
			return true;
		}
		if ((Integer.parseInt(bStrings[0])-Integer.parseInt(aStrings[0])== Integer.parseInt(aStrings[1]))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while (scanner.hasNext()) {
			String a = scanner.next();
			if (add(a)) {
				sum++;
			}
		}
		System.out.println(sum);
		scanner.close();
	}

}
