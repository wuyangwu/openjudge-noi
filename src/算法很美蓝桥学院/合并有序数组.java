package 算法很美蓝桥学院;

import sun.security.util.Length;
import sun.tools.jar.resources.jar;

public class 合并有序数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[11]; // 
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		int[] b = {3,3,4,5,9,10};
		int i = 4,j = 5, length = 10;
		while (length>=0) {
			if (i>=0&&j>=0&&a[i]>=b[j]) {
				a[length] = a[i];
				i--;
			}else {
				if (i>=0&&j>=0) {
					a[length] = b[j];
					j--;
				}
			}
			length--;
		}
		for (int k = 0; k < 10; k++) {
			System.out.print(a[k]+" ");
		}
	}

}
