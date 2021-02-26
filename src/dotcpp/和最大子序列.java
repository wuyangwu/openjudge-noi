package dotcpp;

import java.util.Scanner;

public class 和最大子序列 {
	
//	static int max(int i, int j, int k) {
//		return Math.max(Math.max(i, j), k);
//	}
//	
//	static int guibing(int nu[] , int i , int  lth) {
//		if (i == lth) { // 只有一个值
//			if (nu[i]>0) {
//				return nu[i];
//			}
//			return 0;
//		}
//		int center = i+(lth-i)/2;
//		int maxleft = guibing(nu, i, center);
//		int maxright = guibing(nu, center+1,lth);
//		int maxleftsum =0,leftsum =0;
//		for (int j = center; j >=i; j--) {
//			leftsum += nu[j];
//			if (leftsum>maxleftsum) {
//				maxleftsum = leftsum;
//			}
//		}
//		int maxrightsum = 0, rightsum =0 ;
//		for (int j = center+1; j < nu.length; j++) {
//			rightsum += nu[j];
//			if (rightsum>maxrightsum) {
//				maxrightsum = rightsum;
//			}
//		}
//		
//		return max(maxleft, maxright, maxleftsum+maxrightsum);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nu = new int[n];
		for (int i = 0; i < n; i++) {
			nu[i] = scanner.nextInt();
		}
		int sum = 0, max=0;
		for (int i = 0; i <n; i++) {
			sum += nu[i];
			if (sum>max) {
				max = sum;
			}
			if (sum <0) {
				sum = 0;
			}
		}
		System.out.println(max);
	}

}
