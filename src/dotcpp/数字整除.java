package dotcpp;

import java.math.BigInteger;
import java.util.Scanner;

public class 数字整除 {
  // 分治思路
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = "";
		while (!(a = scanner.next()).equals("0") ) {
			//除去
			BigInteger aBigInteger = new BigInteger(a).divide(new BigInteger("10"));
			BigInteger dBigInteger = new BigInteger(String.valueOf((a.charAt(a.length()-1)-'0')*5));
			// 减去
			BigInteger bigInteger = aBigInteger.subtract(dBigInteger);
			//求余数
			BigInteger cBigInteger = bigInteger.remainder(new BigInteger("17"));
		
			if (Integer.valueOf(cBigInteger.toString())==0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
		}
	
	}

}
