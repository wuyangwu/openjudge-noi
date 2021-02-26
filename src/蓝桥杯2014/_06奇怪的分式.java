package 蓝桥杯2014;

public class _06奇怪的分式 {
	public static void main(String[] args) {
		int sum = 0;
		for(double i = 1; i<=9;i++) {
			for(double j = 1;j <=9;j++) {
				if (i == j) {
					continue;
				}
				for (double k = 1; k <=9; k++) {
					for(double l =1; l <=9; l++) {
					  if (k == l) {
						continue;
					}
						if (((i*k)/(j*l))== (i*10+k)/(j*10+l)) {
							System.out.println(i+" "+j+" "+k+" "+l);
							sum++;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
