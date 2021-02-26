package 蓝桥杯2015;

public class _07牌型种数 {
	static int ans = 0;
	
	static void dfs(int k, int s) {
		if(k>13||s>13) return;
		if(k == 13&&s==13) {
			ans++;
			return;
		}
		
		for(int i = 0; i<5; i++) {
			dfs(k+1,s+i);
		}
	}

	public static void main(String[] args) {
		
	}

}
