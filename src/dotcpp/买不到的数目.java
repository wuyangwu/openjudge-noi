package dotcpp;

import java.util.Scanner;

public class 买不到的数目 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long[]  number = new long[9999999];
		int[]  numbers= new int[2];
		numbers[0] = n; numbers[1] = m;
		number[0] = 1;
		for (int i = 0; i <2; i++) {
			for (int j = 0; numbers[i]+j <number.length ; j++) {
				if (number[j] == 1) {
					number[j+numbers[i]] = 1;
				}
			}
			
		}
		int max = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 0) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
