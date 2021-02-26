package dotcpp;

import java.util.Scanner;

public class 防御导弹 {
  // 最长非下降子序列
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String aString = scanner.nextLine();
		String[] number = aString.trim().split(" ");
		int[] ns = new int[number.length];
		int[] a = new int[number.length];
		for (int i = 0; i <number.length; i++) {
			ns[i] = Integer.parseInt(number[i]);
			a[i] =1;
		}
		int max = 0;
		for (int i = 1; i < number.length; i++) {			
			for (int j = 0; j < i; j++) {
				if (ns[i]<=ns[j]) {
					a[i] = Math.max(a[i], a[j]+1);
				}
				max = Math.max(max, a[i]);
			}
		}
		System.out.println(max);
		
	}

}
