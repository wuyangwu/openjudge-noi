package 挑战程序设计竞赛书籍题目;

import java.util.Arrays;

public class 贪心FenceRepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int L[] = {8,5,8};
		// 这题目就是求出最短板和次短板相加，让在把相加的值代入里面以此比较重复求最短板和次短板的
		int[] c = new int[n];
		Arrays.sort(L); // 排序
		c[0] = L[0]+L[1];
		int i = 2,j=1,a,b,k=0,ans =c[0];
		while (j<n-1) {
			if(i<n&&L[i]<c[k]) { //
				a = L[i++];
			}else {
				a = c[k++];
			}
			
			if(i<n&&L[i]<c[k]) {
				b=c[i++];
			}else {
				if (c[k]==0) {
					b= c[i++];
				}else {
					b = c[k++];
				}
			}
			c[j++] = a+b;
			ans += c[j-1];
		}
		System.out.println(ans);
	}

}
