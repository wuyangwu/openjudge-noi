package dotcpp;

import java.util.Scanner;



public class 龟兔赛跑预测 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v1 = scanner.nextInt(); // 兔子的速度
		int v2 = scanner.nextInt(); // 乌龟的速度
		int t = scanner.nextInt(); // 领先多少米或已上
		int s = scanner.nextInt(); // 休息s秒
		int l = scanner.nextInt(); // 跑道长度
		
		int v1l =0, v2l = 0,t1 = 0, t2 = 0; 
		
		while (v1l<l&&v2l<l) {
			if (v1l-v2l<t) {
				t1++;t2++;
				v1l = v1*t1;
				v2l = v2*t2;
			}else {
				t2+=s;
				v2l = v2*t2;
			}
		}
		if (v1l == v2l) {
			System.out.println("D");
			System.out.println(t2);
		}else {
			if (v1l>v2l) {
				System.out.println("R");
				System.out.println(t2);
			}else {
				System.out.println("T");
				System.out.println(l/v2);
			}
		}
	}

}
