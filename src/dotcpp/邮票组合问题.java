package dotcpp;

public class 邮票组合问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[28];
		int sum = 0;
		int cout =0 ;
		for (int i = 0; i <= 4; i++) {
			for(int j = 0; j <= 3; j++) {
				number[i*3+j*5] = 1;
				cout++;
			}
		}
		for (int i = 1; i < 28; i++) {
			if (number[i] == 1) {
				sum++;
			}
		}
		System.out.println(sum);
		System.out.println(cout);
	}

}
