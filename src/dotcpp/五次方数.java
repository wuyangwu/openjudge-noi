package dotcpp;

public class 五次方数 {
	
	static int jisuan(int n) {
		int s = 0;
		while (n!=0) {
		  s += (int)Math.pow(n%10, 5);
		  n /= 10;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1000; i< 9999999; i++) {
			if(jisuan(i) == i) {
				System.out.println(i);
			}
		}
	}

}
