package dotcpp;

import java.math.BigInteger;
import java.util.Scanner;

public class 产生数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		int n = in.nextInt();
		int[][] f = new int[10][10];
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			f[x][y] = 1;
		}
		//根据规则，更新每个数字能链接到的节点
		//一个数字能变换的种类为可直接变换的和可间接变换的

		/*
		 * 比如 1 2 2 3
		 * 
		 * 那么就自动多出来一个条件 1 3
		 * 
		 * 就是1 有三种变化
		 * 
		 * 这种情况用弗洛伊德算法 找到一个数字可以变化的次数和
		 * 
		 * 之后在连续乘起来 得到的结果就是变化次数
		 *///可以间接转化的数，并且注意这个i,j,k的排列。只有这种排列可以找到所有情况
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					if(i != j && j != k && i != k) {
						if(f[j][i] == 1 && f[i][k]==1) {
							f[j][k] = 1;
						}
					}
				}
			}
		}
		BigInteger sum = BigInteger.ONE;
		for(int i=0;i<s1.length();i++) {
			int num = s1.charAt(i) - '0'; //转化成int的节点下标
			int cnt = 1;//初始化为1是因为，最后可能的数中包含自身，所以自身也是一种情况
			for(int j=0;j<10;j++) {//符合规则可以交换（走通）
				cnt += f[num][j]; //计算每一位数字最多能变为几种数字
			}
			sum = sum.multiply(BigInteger.valueOf(cnt));
		}
		System.out.println(sum);
	}

}
