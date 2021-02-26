package NOIGo.b1.b111;

import java.util.Scanner;

public class b04 {
	
	static boolean check(double center, double nu[], int k) {
		int count =0;
		for (int i = 0; i < nu.length; i++) {
			count += (int)(nu[i]/center);
		}
		
		if (count>=k) { //值小了
			return true;
		}else{// 值大了
		return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		double[] nu = new double[n];
		double min = 0;
		double s = 0 ;
		for (int i = 0; i <n; i++) {
			nu[i] = scanner.nextDouble();
			min = Math.max(min,nu[i]);
		}
		double i =0;
		while (s<=min) {
			double center = s+(min - s)/2;
			if (check(center, nu, k)) {
				s = center+0.01;
				i = center;
			}else {		
				min = center-0.01;
			}
		}
		if (i>=1) {
			System.out.println(String.format("%.2f", i));
		}else {
			System.out.println(String.format("%.2f", 0.00));
		}
		
	}

}
