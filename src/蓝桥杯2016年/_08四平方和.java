package 蓝桥杯2016年;

import java.util.Scanner;

public class _08四平方和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int a = (int)Math.sqrt(n);
		for (int i = 0; i <=a/2; i++) {
			for (int j = i; j <=a/2; j++) {
				for (int j2 = j; j2 <=a; j2++) {
					for (int k = j2; k <=a; k++) {
						if ((i*i+j*j+j2*j2+k*k) == n) {
							System.out.println(i+" "+j+" "+j2+" "+k);
							System.exit(0);
						}
					}
				}
			}
		}
	}

}
