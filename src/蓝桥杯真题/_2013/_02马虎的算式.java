package 蓝桥杯真题._2013;

public class _02马虎的算式 {

	public static void main(String[] args) {
		//枚举
		int sum = 0;
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				for (int c = 1; c <10; c++) {
					for (int d = 1; d <10; d++) {
						for(int e = 1; e<10; e++) {
							if (a!=b&&a!=c&&a!=d&&a!=e&&b!=c&&b!=d&&b!=e&&c!=d&&c!=e&&d!=e) {
								if ((a*10+b)*(c*100+d*10+e) == (a*100+d*10+b)*(c*10+e)) {
									sum++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}
