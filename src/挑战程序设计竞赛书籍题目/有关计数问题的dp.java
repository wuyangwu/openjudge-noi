package 挑战程序设计竞赛书籍题目;

import sun.tools.jar.resources.jar;

public class 有关计数问题的dp {
	
	static int a[] = new int[4];
	// 递归思路
	static void dfs(int j,int n,int sum) {
		
		if(n == 3) {
			if (sum == 4) {
//				System.out.println(sum);
				for( int i = 0; i< 3; i++) {
					System.out.print(a[i]+" ");
				}
				System.out.println();
			}
			return;
		}
		
		for(int i = j; i <=4; i++){
			a[n] = i;
			dfs(i, n+1, sum+i);
			a[n] = 0;
		}
	}
	// 普通的暴力枚举算法
	static void meiju() {
		for(int i = 0; i<= 4; i++) {
		for(int j =i ;j <=4; j++) {
			for (int k = j; k <=4; k++) {
				if((i+j+k) == 4) {
					System.out.println(i+""+j+""+k);
				}
			}
		}
	}
	}

	public static void main(String[] args) {
//		dfs(0, 0, 0);
		// TODO Auto-generated method stub
		meiju();
	}
}





















