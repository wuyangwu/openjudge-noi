package 蓝桥杯2014;

public class _07扑克序列 {
	static char a[] = {'A','A','2','2','3','3','4','4'};
	static int[] biaoji = new int[8];
   static	char[] b = new char[8];
   
   static boolean check(char c[]) {
	   String aString  =new String(c);
	   if (aString.lastIndexOf('A')-aString.indexOf('A') == 2&&
			   aString.lastIndexOf('2')-aString.indexOf('2') == 3&&
			   aString.lastIndexOf('3')-aString.indexOf('3') == 4&&
			   aString.lastIndexOf('4')-aString.indexOf('4') == 5) {
		   return true;
		
	}
		return false;
   }
   
	static void dfs(int m) {
		if (m == 8) {
			char c[] = b.clone();
			if (check(c)) {
				System.out.println(b);
			}
		}
		
		for (int i = 0; i < 8; i++) {
			if (biaoji[i] == 0) {
				biaoji[i] = 1;
				b[m] = a[i];
				dfs(m+1);
				biaoji[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		dfs(0);
	}
}
