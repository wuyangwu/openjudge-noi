package dotcpp;

import java.util.Scanner;

public class 字符串输入输出函数 {
	
	static void GetReal(double a) {
		System.out.println(a);
	}
	static void GetString(String b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		scanner.nextLine();
		String bString=  scanner.nextLine();
		System.out.println("please input a number:");
		System.out.println("please input a string:");
		GetReal(a);
		GetString(bString);
	}

}
