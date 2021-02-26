package dotcpp;

import java.util.Scanner;

public class 删除数组中的0元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		int j = 0, k = n;
		for (int i = 0; i < n; i++) {
			if (num[i] != 0) {
				num[j++] = num[i];
			}else {
				k--;
			}
		}
	
		for (int i = 0; i <k; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println(k);
	}

}
