package 算法很美蓝桥学院;

public class 二叉数 {

	static void xianxu(int a[], int i) {
		if (i>=a.length) {
			return;
		}
		System.out.print(a[i]+" "); // 先打印根节点
		xianxu(a, 2*i+1); // 左子列
		xianxu(a, 2*i+2); // 右子列
	}
	
	static void zhongxu(int a[] , int i) {
		if (i>=a.length) {
			return ;
		}
		zhongxu(a, 2*i+1);//左子列
		System.out.print(a[i]+" "); // 先打印左子列
		zhongxu(a, 2*i+2); // 右子列
	}
	
	static void houxu(int a[] ,int i) {
		if (i>=a.length) {
			return ;
		}
		houxu(a, 2*i+1);//做子列
		houxu(a, 2*i+2); // 右子列
		System.out.print(a[i]+" "); // 先打印左子列
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {78,56,34,43,4,1,15,2,23};
		
		/*
		 * 树的样子
		 *     78
		 *  56    34
		 * 43 4  1  15   
		 *2 23 
		 * 
		 * */
		// 先序根  78,56,43,2,23,4,34,1,15
//		xianxu(a, 0);
		// 中序根 2 43 23 56 4 78 1 34 15
//		zhongxu(a, 0);
		// 后序根 2 23 43 4 56 1 15 34 78
		houxu(a, 0);
	}

}
