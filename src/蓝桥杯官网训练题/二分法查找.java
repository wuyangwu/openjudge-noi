package 蓝桥杯官网训练题;

import java.util.Scanner;

public class 二分法查找 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int[] numb = new int[10];
		for (int i = 0; i < 10; i++) {
			numb[i] = scanner.nextInt();
		}
		int n = scanner.nextInt();
		int i =0;
		int center = 0, z = -1;
		int j = 9;
		while (i<=j) {
			center = i + (j-i)/2;
			if (numb[center] == n) {
				z = center;
				break;
			}
			if (numb[center]> n) {
				j = center-1;
			}else {
				i= center+1;
			}
		}
		System.out.println(z);
	}
}
