package 蓝桥杯2014;

public class _03猜字母 {
	public static void main(String[] args){
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s'};
		char[] b = new char[2015];
		int j = 0;
		for (int i = 1; i <= 2014; i++) {
			b[i] = a[j++];
			if (j==19) {
				j =0;
			}
		}
		int n = 1024;
		while(true) {
			int p =1;
			for (int i = 1; i <=n; i++) {
				if (i%2==0) {
					b[p] = b[i];
					p++;
				}
			}
			n = p;
			if (n==2) {
				break;
			}
		}
		System.out.println();
	}
}
