package dotcpp;

import java.util.Scanner;

public class 分分钟的碎碎念 {
	
	static int answ = 0;
	static int n =0 ;
	// 
	static void dfs(int i, int length, int from[]){
		int ans = 0;
		for (int j = 1; j <= n; j++) {
			if (from[j] == i) {
				dfs(j, length+1, from);
				ans++;
			}
		}
		if (ans == 0) {
			if (length>answ) {
				answ = length;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		int[] from = new int[n+1];
		for (int i = 1; i <= n; i++) {
			from[i] = scanner.nextInt();
		}
		dfs(0, 0, from);
		System.out.println(answ);
	}
}
