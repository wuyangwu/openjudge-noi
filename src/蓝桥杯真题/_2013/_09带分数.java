package 蓝桥杯真题._2013;

import java.util.Scanner;

public class _09带分数 {
	
	static int n;
	static int[] biaoji =new int[10]; 
	static int[] num =new int[10];
	static int sum = 0;
	
	static int zhi(int c,int i) {
		int z = 0;
		for (int j = c; j <=i; j++) {
			z = z*10+num[j];
		}
		return z;
	}
	
	static void dfs(int m) {		
		if(m == 10) {
			for(int i =1;i<10;i++) {
				int jia = zhi(1,i);
				if (jia>n) {
					break;
				}
				for (int j = 8; j>=i+1; j--) {
					int beichushu = zhi(i+1,j );
					int chushu = zhi(j+1,9 );
					if ((beichushu%chushu)==0&&(jia + (beichushu/chushu))==n) {
//						System.out.println(jia+" "+beichushu+" "+chushu);
						sum++;
					}
				}
			}
			return;
		}
		
		
		for (int i =1 ;i < 10;i++) {
			if (biaoji[i] == 0) {
				biaoji[i] = 1;
				num[m] = i;
				dfs(m+1);
				biaoji[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		dfs(1);
		System.out.println(sum);
	}
}
