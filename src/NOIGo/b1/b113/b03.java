package NOIGo.b1.b113;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/6 16:02 8进制小数
 * 0.001953125
 * 0.015625
 *0.125
 */
public class b03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10000];
        int count =1, i = 0;
        String number = scanner.next();
        double sum = 0;
        for (i = 2; i< number.length(); i++){
            a[count++] =  number.charAt(i)-'0';
        }
        for (i = 1 ; i<count; i++){
            sum += a[i]*Math.pow(8,-i);
        }
        //格式化double 测试过了技术法小数不嫩太多
//        System.out.println(number+" "+sum);
        BigDecimal bigDecimal = new BigDecimal(number);
//        String.valueOf(sum).replaceAll("0+?$", "").replaceAll("[.]$", "")
        System.out.println(bigDecimal.toString()+" "+"[8] = "+new BigDecimal(sum).toString()+" [10]");
    }
}
