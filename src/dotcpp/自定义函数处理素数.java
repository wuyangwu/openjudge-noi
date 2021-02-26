package dotcpp;

import java.util.Scanner;

public class 自定义函数处理素数 {

	static boolean sushu(int n) {
		for (int i = 2; i*i<=n; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		if (n<=1) {
			System.out.println("not prime");
		}else {
			if (sushu(n) == true) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
		}
	}

}
