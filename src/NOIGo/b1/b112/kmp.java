package NOIGo.b1.b112;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/31 22:12
 */
public class kmp {

    /**
     * 暴力破解法
     * @param ts 主串
     * @param ps 模式串
     * @return 如果找到，返回在主串中第一个字符出现的下标，否则为-1
     */
    public static int bf(String ts, String ps) {
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        while (i < t.length && j < p.length) {
            if (t[i] == p[j]) { // 当两个字符相同，就比较下一个
                i++;
                j++;
            } else {
                i = i - j + 1; // 一旦不匹配，i后退
                j = 0; // j归0
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }

    }
    public static int[] getNext(String ps) {
        char[] str = ps.toCharArray();
        int[] next = new int[str.length];
        next[0] = -1;
        int k = -1;
        for (int q =  1; q<=str.length-1;q++){
            while (k>-1&&str[k+1]!=str[q]){
                 k = next[k];
                 // 我个人觉得他使用了 递归中的把大问题 分解成很多小问题 比如 有字符串 ababaca 来算他的前缀和后缀是否相同，我们可以把这个问题分解成 算
                // a, ab , aba,   abab, ababa,  ababac, ababaca , -1,-1,0,1,2,-1,0
            }
            if (str[k+1]==str[q])
                k++;
            next[q] = k;
        }
        return next;
    }

    static int Kmp(String number , String ps){
        // 比较顺序
        //abcabcdhijk
        //abcabb
        //abcabcdhijk
        //   abcabb
        //abcabcdhijk
        //      abcabb
        int[] next = getNext(ps);
        int numberlength = number.length();
        int pslength = ps.length();
        int k = -1;
        int i = 0;
        for ( i=0; i < numberlength; i ++){
            while (k>-1&&ps.charAt(k+1) != number.charAt(i)){
                k = next[k];
            }
            if (ps.charAt(k+1) == number.charAt(i))
                k++;
            if (k==pslength){
                System.out.println();
            }
        }
        return i;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number  = scanner.next();
        String str = scanner.next();
        System.out.println(Kmp(number,str));

    }
}
