package 蓝桥杯2016年;

public class _02生日蜡烛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=100; i++) {
			int sum = 0;
			for (int j = i; j <=100; j++) {
				sum += j;
				if (sum == 236 ) {
					System.out.println(i+" "+j);
				}
			}
			
		}
		// 26
	}

}
