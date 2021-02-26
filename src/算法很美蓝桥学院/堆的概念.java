package 算法很美蓝桥学院;

import test.aad;

public class 堆的概念 {
	
	
	static void  makeMinHeap(int a[]) {
		for (int i =(a.length/2)-1; i>=0;i--) {
			MakeHeapFixDown(i, a);
		}
	}
	
	static void MakeHeapFixDown(int i, int a[]) {
		int j = 2*i+1; // 左子叶
		int temp = a[i];
		while (j<a.length) {
			if (a[j]>a[j+1]) { // 左右两个找出最小的节点位置
				j++;
			}
			if (a[j]<temp) { //最小的节点和根节点判断
			a[i] = a[j];
			 i = j;
			}else {
				break;
			}
			j = 2*i+1;
		}
		a[i] = temp;
	}

	static void MakeMaxHeap(int b[]) {
		for (int i = (b.length/2-1); i>=0;i--) {
			MakeHeapFixUp(i, b);
		}
	}
	
	static void MakeHeapFixUp(int i, int b[]) {
		int j = 2*i+1;
		int k = b[i];
		while (j<b.length) {
			if (b[j]<b[j+1]) {
				j++;
			}
			if (b[j]>k) {
				b[i] = b[j];
				i = j;
			}else {
				break;
			}
			j = 2*i+1;
		}
		b[i] = k;
		
	}
	
	public static void main(String[] args) {
		int[] a = {5,6,3,2,8,1,9};
		int[] b = {5,6,3,2,8,1,9};
		// 堆的概念,堆分为大顶堆和小顶堆
		/*
		 * 
		 * */
//		小顶堆
		makeMinHeap(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
//		大项堆
		MakeMaxHeap(b);
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}
