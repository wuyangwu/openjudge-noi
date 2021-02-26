package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 13:55
 */
public class 翻硬币 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        // 每个不同的相邻位置减去就是相邻不同的翻转次数比如：
        // *o*o
        // ****
        //翻转2次
        int sum=0, k =0 , count =0;
        for (int i = 0 ; i< n.length(); i++){
              if (count == 0){
                  if (n.charAt(i)!=m.charAt(i)){
                      k = i;
                      count = 1;
                  }
              }else {
                  if (n.charAt(i)!=m.charAt(i)){
                      sum += i-k;
                      count =0;
                  }

              }
        }
        System.out.println(sum);
    }
}
