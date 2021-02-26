package dotcpp;

import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class 大数加法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		String a = scanner.next();
		String b = scanner.next();
		System.out.println(new BigDecimal(a).add(new BigDecimal(b)));
	}

}
