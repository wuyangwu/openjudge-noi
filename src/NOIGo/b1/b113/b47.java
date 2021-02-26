package NOIGo.b1.b113;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/8 14:15 大数据除法
 */
public class b47 {
    static int digit = 0;
    static boolean temp = false; // 被除数是否小于除数的判断
    static int[] z = new int[1000];

    static void sub(int[] x,int[] y,int len1,int len2){//大数相减
        for (int i = 0; i< len1; i++){
            if (x[i]<y[i]){
                x[i] = x[i]+10-y[i];
                x[i+1]--;
            }else {
                x[i] = x[i] -y[i];
            }
        }
        //被除数减完之后，被除数的位数
        for (int i = len1 -1;i>=0;i--){
            if (x[i]>0){
                digit = i+1;
                break;
            }
        }
    }

    // 判断被除数是否大于
    static boolean judge(int[] x,int[] y,int len1,int len2){
        if (len1<len2){
            return false;
        }
        for (int i = len1-1;i>=0;i--){
            if (x[i]==y[i])
                continue;
            if (x[i]>y[i]) // 被除数大于除数
                return true;
            if (x[i]<y[i]) // 被除数小于除数
                return false;
        }
        return true; // 被除数等于除数返回值0
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next(); // 被除数
        String m = scanner.next(); // 除数
        int len = n.length()-m.length();// 被除数于除数的位数的差值
        int  k = m.length(); // 除数原位数
        int len1=n.length(),len2 = m.length();
        int[]  numbern = new int[1000];
        int[]  numberm = new int[1000];
        for (int i=0; i<n.length();i++ )
            numbern[i] = n.charAt(n.length()-i-1)-'0';
        for (int i=0; i<m.length();i++)
            numberm[i] = m.charAt(m.length()-i-1)-'0';
        if (len>=0){
            // 除数的长度等于被除数 。除数后面补0；
            for (int i =n.length()-1;i>=0;i--){
                if (i>=len){
                    numberm[i]=numberm[i-len];
                }else {
                    numberm[i] = 0;
                }
            }
            len2 = len1; //
            digit = n.length();// 被除数长度赋值给digit
            for (int j = 0; j <=len; j++){
                while ((temp =judge(numbern,numberm,len1,len2))&&digit>=k){ // 被除数大于除数和 除数补0后长度除数
                    sub(numbern,numberm,len1,len2); //大数据减法
                    z[len-j]++; //每减去一次+1
                    len1 = digit;
                    if (len1<len2&&numberm[len2-1]==0){
                        len2 = len1;
                    }
                }
                if (!temp){ //若被除数小于除数，除数减去1位
                    for (int i = 1; i<len2; i++){
                        numberm[i-1] = numberm[i];
                    }
                    numberm[len2-1] = 0;
                    if (len1<len2)
                        len2--;
                }
            }
            while (z[len]==0){
                if (len==0)
                    break;
                len--;
            }
            for (int i = len; i>=0;i--)
                System.out.print(z[i]);
        }else {
            System.out.println(0);
        }
    }
}
