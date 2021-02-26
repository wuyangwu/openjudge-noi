package dotcpp;

import java.math.BigInteger;
import java.util.Scanner;

public class 产生数2练习 {
 // 第二次练习加深思路
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int k = scanner.nextInt();
		int[][] nu = new int[10][10];
		for (int i = 0; i <k; i++) {
			nu[scanner.nextInt()][scanner.nextInt()] = 1;
		}
		
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int k1 = 1; k1 <= 9; k1++) {
					if (i!=j&&j!=k1) {
						if (nu[i][j]==1&&nu[j][k1]== 1) {
							nu[i][k1] = 1;
						}
					}
				}
			}
		}
		BigInteger bigInteger = BigInteger.ONE;
		for (int i = 0; i <n.length(); i++) {
			int j = n.charAt(i) - '0';
			int sum = 1;
			for (int j2 = 1; j2 <=9; j2++) {
				if (nu[j][j2] == 1) {
					sum++;
				}
			}
			bigInteger =bigInteger.multiply(new BigInteger(String.valueOf(sum)));
		}
		System.out.println(bigInteger.toString());
	}

}
