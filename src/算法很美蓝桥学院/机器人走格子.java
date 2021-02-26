package 算法很美蓝桥学院;

import java.util.Scanner;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class 机器人走格子 {

	
	static int dfs(int x, int y) {
		
		if(x == 1 || y == 1) {
			return 1;
		}
		return dfs(x,y-1)+dfs(x-1, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		// 递归公式
		System.out.println(dfs(x, y));
	
		// 递推公式类似于动态规划法
		int[][] nu = new int[x+1][y+1];
		for(int i = 1; i<= y;i++) {
			// 初始化数据
			nu[1][i] = 1;
		}
		for(int i = 1; i<= x; i++){
			nu[i][1] = 1;
		}
		for(int i = 2; i <=x; i++) {
			for(int j = 2; j<=y;j++) {
				nu[i][j] = nu[i-1][j]+nu[i][j-1]; 
			}
		}
		System.out.println(nu[x][y]);
	}

}
