package 算法很美蓝桥学院;

import java.util.Scanner;

public class 二进制1的个数 {
	
//	第一种方法位移
	public static int weiyi(int n) {
		int sum = 0;
		while (n!=0) {
			if (((n>>0)&1)==1) {
				sum++;
			}
			n= n>>1;
		}
		return sum;
	}
	
// 第二个方法与方法
	public static int yu(int n) {
		int sum = 0;
		while (n != 0) {
			n= (n-1)&n;
			sum++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("打印输入的数的二进制形式"+Integer.toString(n,2));
		System.out.println("位移的方法,1的个数为"+weiyi(n));
		System.out.println("与的方法,1的个数为"+yu(n));
	}

}
