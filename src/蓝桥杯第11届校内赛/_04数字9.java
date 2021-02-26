package 蓝桥杯第11届校内赛;

public class _04数字9 {

	static boolean check(String nu) {
		for (int i = 0; i < nu.length(); i++) {
			if (nu.charAt(i) == '9') {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 9; i <=2019; i++) {
			if (check(String.valueOf(i))) {
				sum++;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		// 544
	}

}
