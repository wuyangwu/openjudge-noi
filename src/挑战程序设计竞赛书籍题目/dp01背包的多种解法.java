package 挑战程序设计竞赛书籍题目;

import sun.net.www.content.audio.wav;

public class dp01背包的多种解法 {
	
	static int n = 4;
	static int w[] = {2,1,3,2}; // 重量
	static int v[] = {3,2,4,2}; //价值
	static int W = 5; // 背包容量
	static int[][] num = new int[4+1][5+1];
	//递归的方法写
	// i为物品数量 - j为物品价值
	static int beibao(int i, int j) {
		int res;
		if(num[i][j]!=0) {
			return num[i][j];
		}
		if(i == n) { // 说明没有剩余物品
			num[i][j] = 0;           
				num[i][j] = beibao(i+1, j);
			}else {
				// 则挑选或者寻找下一个
				num[i][j] = Math.max(beibao(i+1, j),(beibao(i+1, j-w[i])+v[i]));
			}
		return num[i][j];
	}
	public static void main(String[] args) {
		System.out.println(beibao(0, W));
	}
}
