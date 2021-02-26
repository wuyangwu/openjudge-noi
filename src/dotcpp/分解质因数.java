package dotcpp;

import java.util.Scanner;

public class 分解质因数 {
	
	static int b = 0;
	static int a = 0;
	
	static boolean sushu(int c) {
		for (int i = 2; i*i <=c; i++) {
			if (c%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static String yinshi(int i) {
		int j = 2;
		if (!sushu(i)) {
			
			for (; j < i; j++) {
				if (i%j==0) {
					return String.format("%s*%s",j,yinshi(i/j));
				}
			}
		}
		
		return String.valueOf(i);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String dString =yinshi(8);
//		
		 a = scanner.nextInt();
		 b = scanner.nextInt();
		int[] n = new int[b+1];
		for (int i = a; i <=b; i++) {
			if (sushu(i)) {
				n[i] =1; // 素数为1；
			}
		}
		for (int i =a;i<=b; i++) {
			String dString = "";
			if (n[i] == 0) {
				dString = yinshi(i);
			}else {
				dString =String.valueOf(i);
			}
			System.out.println(String.format("%s=%s",i,dString));
		}
	}

}