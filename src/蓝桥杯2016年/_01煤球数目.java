package 蓝桥杯2016年;

public class _01煤球数目 {
	public static void main(String[] args) {
		int i =1;
		int sum =1;
		for (int j = 2; j <=100; j++) {
			i += j;
			sum+=i;
			System.out.println("第"+j+"层"+":"+i);
			// 答案171700
		}
		System.out.println(sum);
	}
}
