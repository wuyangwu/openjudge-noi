package 蓝桥杯第11届校内赛;

import java.util.Scanner;

public class _09_01 {
    static final int MOD = 10000;
    static int N;
    static long ans;
    static long[][] mem = new long[11][11];
    static Scanner sc = new Scanner(System.in);

    static long dfs(int pre, int cur) {
        // 询问状态
        if (mem[pre][cur] != 0)
            return mem[pre][cur];
        long ans = 1;
        for (int j = 1; j < Math.abs(pre - cur); j++) {
            ans = (ans + dfs(cur, j)) % MOD;
        }
        mem[pre][cur] = ans;
        return ans;
    }

    static void work() {
        ans = 0;
        N = sc.nextInt();
		long ago = System.currentTimeMillis();
        //    f(pre,cur) = sum(f(cur,_new))|_new from 1 to abs(pre-cur)-1
        for (int x = 1; x <= N; ++x) ans = (ans + dfs(N, x)) % MOD;
        System.out.println(ans);
//		System.err.println(System.currentTimeMillis() - ago);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while (true) {
            work();  
        }
    }
}	
