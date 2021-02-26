package NOIGo.b2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/7 22:57
 */
public class test {
    public static void main(String[] args){
        // 把科学技术法转换成小数
        String abc = "1.567840334E12";
        BigDecimal bd = new BigDecimal(abc);
        System.out.println(new BigDecimal(Double.parseDouble(bd.toPlainString())).toString());
        System.out.println(new BigDecimal(1.7105E-7).toString());
    }
}
