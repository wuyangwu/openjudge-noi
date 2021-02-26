package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 23:21
 */
public class 递归倒置字符数组 {

    static void digui(char strs[], int i, int j, int mind,int n){
        if (i>=mind){
            return;
        }
        char a = strs[i];
        strs[i] = strs[j];
        strs[j] = a;
        for (int k=0; k< n;k++){
            System.out.print(strs[k]);
        }
        System.out.println();
         digui(strs,i+1,j-1,mind,n);
    }
    // 这个写法没问题但是说格式错误
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner .nextInt();
        String  number = scanner.next();
        char[] strs = number.toCharArray();
        if (n==1){
            for (int i =0; i<n;i++){
                System.out.print(strs[i]);
            }
            System.exit(0);
        }
        digui(strs,0,n-1,n/2,n);
        System.out.println();
        for (int i =0; i<n;i++){
            System.out.print(strs[i]);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        String s = sc.next();
//        char c[] = s.toCharArray();
//        for (int i = 0; i < c.length / 2; i++) {
//            /**交换位置*/
//            char t = c[i];
//            c[i] = c[c.length - 1 - i];
//            c[c.length - 1 - i] = t;
//            /**输出交换后序列*/
//            for (int j = 0; j < c.length; j++)
//                System.out.print(c[j]);
//            System.out.println();
//        }
//        System.out.println();
//        for (int j = 0; j < c.length; j++)
//            System.out.print(c[j]);
//    }
}


