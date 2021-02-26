package dotcpp;

public class 用扩展欧几里得解方程二元一次方程 {
	
	static long x;
	static long y;
	
	// 扩展欧几里得算法
	public static long ext_gcd(long a, long b) {
		if(b == 0) {
			x = 1;
			y = 0;
			return a;
		}
		long res = ext_gcd(b, a%b);
		long x1 = x;
		x = y;
		y = x1- a/b*y;
		return res;
	}
	
	public static void  linearEquart(long a, long b, long m) {
		long c = ext_gcd(a, b); // 求出公约数
		System.out.println("公约数"+c);
		if(m%c!=0) {
			System.out.println("次方程无整数解");
			return ;
		}
		long n = m/c;
		x *= n;
		y *= n;
	}
	
	public static void main(String[] args) {
		linearEquart(2, 4, 2);
		System.out.println(x+" "+y);		
	}
}
