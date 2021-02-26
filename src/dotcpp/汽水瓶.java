package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 19:23
 */
public class 汽水瓶 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m =0;
        while ((m = scanner.nextInt())!=0){
            int sum = 0;
            while (m>=3){
                sum += m/3;
                m = (m-(m/3)*3)+m/3;
            }
            if (m + 1 == 3) {
                sum++;
            }
            System.out.println(sum);
        }
    }
}
