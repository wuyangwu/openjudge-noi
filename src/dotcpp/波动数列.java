package dotcpp;

import java.util.Scanner;

public class 波动数列 {
	    static long n, s, a, b;
	     static long result = 0L;
	     static int e = 0;
	     static long[][] dp;;
	    
	     static void getDP() {
	        dp = new long[2][1100*1100];
	        dp[e][0] = 1;
	        // 1-n个数 能 拆分为j的个数
	        //比如 n=4, x+y=6,一组解 x=3, y=3可能对应着 x=1+2和x=3两个情况，即 +3a -2b -b 或者 -3b + 2a + a
		/*
		 * 4.关键问题是对于一个确定的a的个数，方案不只有一种，而且a的个数肯定是由（1,2,3,...,n-1）这其中的若干项组成的，，我们把这些项看作元素，
		 * 第i个元素的权值为i于是，下面就开始构造递推方程
		 * 
		 * 5.首先，定义一个数组dp[i][j]，表示前i个元素组成和为j的序列的方案数，这里的和j表示的是所有的a的和，很明显当i!=0时dp[i][0]=1,
		 * 当j!=0时dp[0][j]=0，然后我们要分两种情况讨论
		 * (1)、i>j时，因为每一个元素i权值都是i，所以当元素的个数大于和的时候，第i个元素的权值已经超过了和，所以第i个元素绝对不能使用，即dp[i][j]=
		 * dp[i-1][j]。
		 * (2)、i<=j时，第i个元素的权值是小于等于和的，所以可以用，也可以不用，如果不用，那么就是dp[i-1][j]，如果用，就是dp[i-1][j-i]，
		 * 这个有点类似于01背包，所以 dp[i][j]=dp[i-1][j]+dp[i-1][j-i]。
		 */
	        for(int i = 1;i < n;i++) {
	            e = 1 -e;
	            for(int j = 0;j <= i * (i + 1) / 2;j++) {
	                if(i > j)
	                    dp[e][j] = dp[1 - e][j];
	                else
	                    dp[e][j] = (dp[1 - e][j] + dp[1 - e][j - i]) % 100000007;
	            }
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        n = in.nextLong();
	        s = in.nextLong();
	        a = in.nextLong();
	        b = in.nextLong();
	        getDP();
	        for(long i = 0;i <= n * (n - 1) / 2;i++) {
	            long t = s - i * a + (n*(n-1)/2-i) * b;
	            if(t % n == 0)
	                result = (result + dp[e][(int) i]) % 100000007;
	        }
	        System.out.println(result);
	    }

}
