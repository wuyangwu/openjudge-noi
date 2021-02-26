package 挑战程序设计竞赛书籍题目;

public class 动态规划最长上升子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5,max = 0;
		int a[] = {4,2,3,1,5};
		int b[] = new int[a.length];
		// 动态规划
		for(int i = 0; i<a.length; i++) {
			b[i] = 1;
			for(int j =0; j< i; j++) {
				if(a[i]>a[j]) {
					b[i] = Math.max(b[i], b[j]+1);
				}
			}
			if(b[i]>max) {
				max = b[i];
			}
		}
		System.out.println(max);
	}
}
