package 蓝桥杯2016年;

public class _03凑算式 {

	static int[] biaoji = new int[10];
	static double[] nu = new double[10];
	static int n = 10;
	static int sum = 0;
	static boolean check() {
		double a = nu[1];
		double a1 = nu[2]/nu[3];
		double a2 = (nu[4]*100+nu[5]*10+nu[6])/(nu[7]*100+nu[8]*10+nu[9]);
		if (a+a1+a2 == 10) {
			return true;
		}
		
		return false;
	}
	
	static void dfs(int m) {
		if (m == n) {
			if (check()) {
				for (int i = 1; i <10; i++) {
					System.out.print(nu[i]+ " ");
				}
				sum++;
				System.out.println();
			}
		}
		
		for (int i = 1; i <10; i++) {
			if (biaoji[i] == 0) {
				biaoji[i] = 1;
				nu[m] = i;
				dfs(m+1);
				biaoji[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		dfs(1);
		System.out.println(sum);
		// 答案 29
	}

}
