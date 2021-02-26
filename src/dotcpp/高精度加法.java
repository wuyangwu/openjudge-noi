package dotcpp;

import java.math.BigInteger;
import java.util.Scanner;

public class 高精度加法 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger bigInteger = new BigInteger(String.valueOf(scanner.next()));
		BigInteger aBigInteger = new BigInteger(String.valueOf(scanner.next()));
		System.out.print(bigInteger.add(aBigInteger));
	}

}
