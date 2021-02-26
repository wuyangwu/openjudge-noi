package dotcpp;

import java.util.Scanner;

public class 邮票面值设计 {
	static int n =0 ;
	static int  k =0;
	static int[] a = new int[17]; // 存邮票
	static int[] ans = new int[17]; // 存最后的答案
	static int ms = 0;
	static int dp( int t ) { // 动态规划法来获取最大的连续值
		int[] number = new int[50000];
		number[0] = 0; // 邮票为0的时候邮资也为0
		 for(int i=1;i<=a[t]*n;i++)
		      number[i]=50000;//赋初值赋一个尽可能地大就可以了
		for (int i = 1;i<=t; i++) { //邮票种类
			for (int j =a[i]; j<=a[i]*n; j++) { // 邮资需要有哪些邮票的构成的最小n的叠加构成 邮资可以等于上个邮票但是不能大于最大的邮票乘以n
				number[j] = Math.min(number[j],number[j-a[i]]+1);// 这个方程是怎么来的呢
				// 假如 你手上有 种类为 1和3的邮票，最多粘贴5次 
				// 邮资 为 1时候   只能放一张为1的邮票 number[1] = 1
				// 邮资 为 2时候   只能放2一张为1的邮票 number[2] = 2
				// 邮资 为 3时候   最好放一张为3的邮票 number[3] = 1 = number[3] = number[3-3]+1也可以放三张为1的邮,number[3] = number[3-1]+1
				// 邮资为 4时候                                            number[4] = 2 = number[4-3]+1;
				// 状态方程为当前的邮资-当前的邮票+1 number[j] = number[j-邮票]+1
			}
		}
		for (int i = 1; i <=a[t]*n ; i++) {
			if (number[i]>n) {
				return i-1;
			}
		}
		return a[t]*n;
	}
	static void dfs(int t ,int max) { // t代表第几张邮票 max代表最大连续值
		if (t==k+1) {
			if (max>ms) {
				ms = max;
				for (int i = 1; i <=k; i++) {
					ans[i] = a[i];
				}
			}
			return;
		}
		
		for (int i = a[t-1]+1; i <=max+1 ; i++) { //邮票为1的时候最大值为4 下一个邮票的值不能小于上一个邮票的值 所以加1，最大的范围是 连续值+1，如果大于连续值+1，就会不连续
			a[t] = i;
			int x = dp(t); // 算出连续值把
			dfs(t+1,x);
		}
	} 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		dfs(1, 0);// 从1开始找
		for (int i = 1; i <=k; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
		System.out.println(String.format("MAX=%s", ms));
	}

}
