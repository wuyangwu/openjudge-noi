package dotcpp;

public class 水仙花数判断 {
	
	static boolean shui(int m) {
		int sum = 0 ,count =m;
		while (m!=0) {
			sum += Math.pow(m %10, 3);
			m /= 10;
		}
		if (sum != count) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <1000; i++) {
			if (shui(i)) {
				System.out.println(i);
			}
		}
	}

}
