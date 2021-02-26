package 算法很美蓝桥学院;

import javax.sound.midi.Soundbank;

public class 找出唯一的成对的数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,5,8,9,10,7};
		int b = 0;
		for (int i =1; i <=10; i++) {
			b= b^i;
		}
		for (int i = 0; i < a.length; i++) {
			b = b^a[i];
		}
		System.out.println("重复的数字："+b);
	}
}
