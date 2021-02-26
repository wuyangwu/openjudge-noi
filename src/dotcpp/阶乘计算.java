package dotcpp;

import java.math.BigInteger;
import java.util.Scanner;

public class 阶乘计算 {
	
	static BigInteger sum(int n) {
		if (n==1) {
			return new BigInteger("1");
		}
		return new BigInteger(String.valueOf(n)).multiply(sum(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(sum(n));
		System.out.println(sum(n).intValue());
		System.out.println("+++++++++++++++++++++++++++++++++++");
		String nString = Integer.toBinaryString(11); //10- 二进制
		String nString2 = Integer.toHexString(11); // 10-16
		String nString3 = Integer.toOctalString(11); // 10 -8
		System.out.println(nString);
		System.out.println(nString2);
		System.out.println(nString3);
	}

}
