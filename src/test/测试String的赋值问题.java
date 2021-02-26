package test;


public class 测试String的赋值问题 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		b[3] = 2;
		String str1 = "hello";
		 String str2 = str1; //reference to the same string
		 str1 =str1+"2" ;//new string created
		 System.out.println(str1);
		 System.out.println(str2);
		String[] aStrings = {"123","123","123"};
		String[] aStrings2 = new String[3];
		for (int i = 0; i < 3; i++) {
			aStrings2[i] = aStrings[i];
		}
		aStrings2[1] = "12333";
		for (int i = 0; i <3; i++) {
			System.out.println(aStrings[i]);
		}
		System.out.println("========================");
		for (int i = 0; i <3; i++) {
			System.out.println(aStrings2[i]);
		}
		
		 System.out.println("=======================");
		 System.out.println(124&26);
	}
}
