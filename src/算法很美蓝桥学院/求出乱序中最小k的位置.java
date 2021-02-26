package 算法很美蓝桥学院;

import java.util.Scanner;

public class 求出乱序中最小k的位置 {

	static int[] a = {2,6,3,5,7,9};
	
	static int kuaisi(int x, int y,int n) {
		if (x>y) {
			return -1;
		}
		int k = a[x],xl = x,ylength = y;
		while (xl<ylength) {
			while (k<=a[ylength]&&xl<ylength) {
				ylength--;
			}
			int temp = a[xl];
			a[xl] = a[ylength];
			a[ylength] = temp;
			while (k>=a[xl]&&xl<ylength) {
				xl++;
			}
			int tem = a[xl];
			a[xl] = a[ylength];
			a[ylength] =tem; 
		}
		if ((n-1) == xl) {
			return a[xl];
		}else {
			if ((n-1)<xl) {
				return kuaisi(x, xl-1, n);
			}else {
				return kuaisi(xl+1, y, n);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(kuaisi(0,5,n));
	}

}
