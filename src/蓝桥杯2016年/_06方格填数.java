package 蓝桥杯2016年;

public class _06方格填数 {
	
	static int[] biaoji =new int[10];
	
	static int[] nu = new int[10];
	
	static int sum = 0;
	
	static boolean check() {
		if (    Math.abs(nu[0]-nu[1]) == 1 ||
				Math.abs(nu[0]-nu[3]) == 1||
				Math.abs(nu[0]-nu[4]) == 1||
				Math.abs(nu[0]-nu[5]) == 1||
				
				Math.abs(nu[1]-nu[2]) == 1||
				Math.abs(nu[1]-nu[5]) == 1||
				Math.abs(nu[1]-nu[6]) == 1||
				Math.abs(nu[1]-nu[4]) == 1||
				
				Math.abs(nu[2]-nu[5]) == 1||
				Math.abs(nu[2]-nu[6]) == 1||
				
				Math.abs(nu[3]-nu[4]) == 1||
				Math.abs(nu[3]-nu[7]) == 1||
				Math.abs(nu[3]-nu[8]) == 1||
				
				Math.abs(nu[4]-nu[5]) == 1||
				Math.abs(nu[4]-nu[7]) == 1||
				Math.abs(nu[4]-nu[8]) == 1||
				Math.abs(nu[4]-nu[9]) == 1||
				
				Math.abs(nu[5]-nu[6]) == 1||
				Math.abs(nu[5]-nu[8]) == 1||
				Math.abs(nu[5]-nu[9]) == 1||
				
				Math.abs(nu[6]-nu[9]) == 1||
				
				Math.abs(nu[7]-nu[8]) == 1||
				Math.abs(nu[8]-nu[9]) == 1) {
			return false;
		}
		return true;
	}
	
	static void dfs(int n) {
		if (n == 10) {
		 if (check()) {
			sum++;
		}
			return;
		}
		
		for (int i = 0; i < 10; i++) {
			if (biaoji[i] == 0) {
				biaoji[i] = 1;
				nu[n] = i; 
				dfs(n+1);
				biaoji[i] = 0;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(0);
		System.out.println(sum);
		// 答案1580
	}

}
