package dotcpp;

import java.util.Scanner;

public class 带分数 {
	
	static int[] biaoshi = new int[10];
	static int[] zhi = new int[10];
	
	static int count = 0;
	// 123456789
	static void zhi(int m){
		for (int i = 1; i <=7; i++) {
			int s = 0,beichushu=0,chushu=0;
			for (int k = 1; k <=i; k++) {
				s  = s*10 + zhi[k];
			}
			if (s<=m) {
				for (int j = i+1; j <=8; j++) {
					beichushu=0;chushu=0;
					// 算被除数
					for (int j2 = i+1; j2 <=j; j2++) {
						beichushu = beichushu*10+zhi[j2];
					}
					// 算除数
					for (int j2 =j+1; j2<=9;j2++) {
						chushu= chushu*10+zhi[j2];
					}
					if ((beichushu%chushu==0)&&(s+beichushu/chushu)==m) {
						count++;
					}
				}
			}else {
				break;
			}
		}
	}
	
	static void dfs(int n , int m) {
		if (n==10) {
			zhi(m);
		}
		
		for (int i = 1; i < 10; i++) {
			if (biaoshi[i] ==0 ) {
				biaoshi[i] = 1;
				zhi[n] = i;
				dfs(n+1, m);
				biaoshi[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		dfs(1, m);
		System.out.println(count);
	}

}
