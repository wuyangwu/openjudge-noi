package dotcpp;

import java.math.BigInteger;

public class 阶乘位数 {

	public static void main(String[] args) {  
        BigInteger a=f(9999);
        System.out.println(a);
        System.out.println(a.intValue());
        String n=Integer.toBinaryString(11);  //转二进制串
        System.out.println(a.bitLength());  // 求big的位数
    }  
    public static BigInteger f(int n){  
        if(n>1){  
            return BigInteger.valueOf(n).multiply(f(n-1));  
        }else{  
            return BigInteger.ONE;  
        }  
    }  


}
