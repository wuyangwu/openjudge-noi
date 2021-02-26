package dotcpp;

import java.util.Scanner;

public class 邮票 {

	//这个版本c提交没问题 java就是67%
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt() ,j =0;
		int[] numb = new int[2000001];
		int x[] = new int[m]; // m种邮票
		for(int i =0; i< m; i++ ) {
			x[i] = scanner.nextInt();
		}
		
		while (numb[j]<=n) {
			j++;
			numb[j] = 999999;
			for (int i = 0; i <m && x[i]<=j; i++) {
				numb[j] = Math.max(numb[j], numb[j-x[i]]+1);
			}
		}
		System.out.println(j-1);
	}
	
	
	
	
    // 这个版本提交正确率67%
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int m = scanner.nextInt();
//		int[] numb = new int[2000001];
//		int x[] = new int[m]; // m种邮票
//		for(int i =0; i< m; i++ ) {
//			x[i] = scanner.nextInt();
//		}
//		for (int i = 1; i <2000001; i++) {
//			numb[i] = 999999;
//		}
//		for(int i = 0; i<m; i++) {
//			for (int j = x[i]; j <= x[i]*n; j++) {
//				numb[j] = Math.min(numb[j], numb[j-x[i]]+1);
//			}
//		}
//		
//		for (int i =1; i <x[m-1]*n; i++) {
//			if (numb[i]>m) {
//				System.out.println(i-1);
//				System.exit(0);
//			}
//		}
//	System.out.println(x[m-1]*n);
//	}
}
