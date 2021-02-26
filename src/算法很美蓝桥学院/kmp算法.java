package 算法很美蓝桥学院;

public class kmp算法 {
	
	static void match(String a) {
		int[] b = new int[a.length()];
		int k = -1;
		b[0] =-1;
		for (int i = 1; i < a.length(); i++) {
			while (k>-1&&a.charAt(k+1)!= a.charAt(i)) {
				k = b[k];
			}
			
			if (a.charAt(k+1) == a.charAt(i)) {
				k++;
			}
			b[i] = k;
		}
		for (int i = 0; i < a.length(); i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "ababaa";
		String bString = "abcabaa";
		match(aString);
		match(bString);
	}

}
