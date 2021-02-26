package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 18:02
 *
 * 需要题目中的 条件定义[0-255]，分为5种情况
 *
 *   1.  一位数的  \\d  因为 开头一位也可以是0.
 *
 *   2.  两位数的 [1-9]\\d
 *
 *   这里三位数 需要强调两种情况 一种是 100+ 一种是200+
 *   3.  100+     1\\d{2}
 *
 *   4.  200+     2[0-4]\\d
 *
 *   5.  200+     25[0-5]
 */
public class IP判断 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())

        {
            String s=sc.nextLine();
            boolean f=s.matches("((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5])).((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5])).((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5])).((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))");
            if(f)
                System.out.println("Y");
            else
                System.out.println("N");
        }
    }
}
