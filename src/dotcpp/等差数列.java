package dotcpp;

import java.util.Scanner;

public class 等差数列 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a1 = 2 , sum = 0;
		int n = scanner.nextInt();
		for (int i = 1; i <=n; i++) {
			sum += a1 + (i-1)*3; 
		}
		System.out.println(sum);
	}
}
