package 蓝桥杯官网训练题;

import java.util.Scanner;

public class Fibonacci数列 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		int a=1,b=1;
		for (int i = 3; i <=n; i++) {
			int t = a;
			a = (a+b)%10007 ;
			b = t;
		}
		System.out.println(a);
	}

}
