package 蓝桥杯第11届校内赛;

public class _02约数的个数 {
	public static void main(String[] args) {
		int a = 1200000;
		int sum = 0;
		for (int i = 1200000; i>=1; i--) {
			if (a%i == 0) {
				sum++;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		//96
	}
}
