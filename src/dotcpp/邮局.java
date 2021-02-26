package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0  问题 1457: [蓝桥杯][历届试题]邮局
 * @date 2020/2/21 18:57
 *
 * 思路，每个村到每个邮局距离都算出来，然后递归
 */
public class 邮局 {
	static double[][] juli = new double[26][50]; // 邮局到每个村民的距离
	static double[] a = new double[51]; // 每个村民到一个最小的邮局近距离
	static double[] b = new double[26]; // 记录过程最小的邮局
	static double[] d = new double[26]; // 记录最小的邮局
	static int k =0 ; // 需要建立的邮局
	static int m = 0;
	static int n = 0;
	static double sun = 10000001;
	
	// 需要建立的邮局， +备选邮局
	static void dfs(int c , int beixuan) {
		if (c==k) {
			double sum = 0;
			// 需要最小邮局
			for (int i = 0; i < k; i++) {
				sum += b[i];
			}
			if (sum < sun) {
				sun = sum;
				for (int i = 0; i < k; i++) {
					d[i] = b[i];
				}
			}
		}
		if (beixuan <m) { // 备选范围不能大于m
			b[c] = beixuan; // 记录要建立的邮局编号
			int ok = 0;
			// 第判断选中的邮局是否小
			for (int i = 0; i < n; i++) {
				if (a[i]>juli[beixuan][i]) {
				a[i] = juli[beixuan][i];
				ok = 1;
				}
			}
			if (ok == 1) {
				// 找到了小的邮局
				dfs(c+1, beixuan+1);
			}
			//  没有找到小的邮局
			dfs(c, beixuan+1);
		}
		
	}
	
    public static void main(String[] args){
    	Scanner scanner =new Scanner(System.in);
    	 n = scanner.nextInt();
    	 m = scanner.nextInt();
    	 k = scanner.nextInt();
    	double[][] cunmin = new double[n][2];
    	double[][] youju = new double[m][2];
    	for (int i = 0; i < n; i++) {
			cunmin[i][0] = scanner.nextDouble();
			cunmin[i][0] = scanner.nextDouble();
			a[i] = 1000000;
		}
    	for (int i = 0; i < m; i++) {
			youju[i][0] = scanner.nextDouble();
			youju[i][0] = scanner.nextDouble();
		}
    	for (int i = 0; i < m; i++) {
    		for (int j = 0; j < n; j++) {
				juli[i][j] = Math.sqrt(Math.pow(cunmin[i][0]-youju[i][0],2)+Math.pow(cunmin[i][1]-youju[i][1],2));
			}
		}
    	dfs(0,0);
    	for (int i = 0; i < k; i++) {
    		System.out.print(d[i]+1+" ");
		}
    	
    }
}
