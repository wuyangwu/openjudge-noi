package nanshida.b2020Round2;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/16 14:58
 */
public class b7 {
    static String numbern = new String();
    static String numberm = new String();
    static String jieguo = new String();
    static int[] a = new int[30]; // 按照
    static int[] b = new int[30]; // 按照ABCDEFGHI的顺序；
    static int n = 0;
    static boolean book[] = new boolean[30];
    static  int Next[] =new int[30];
    static  int id = 0;
    static int zhi(int c[] , String numberc){
        int sum = 0;
        // 是n进制统一转换成10进制
        for (int i = 0; i< numberc.length(); i++){
             sum +=c[numberc.charAt(numberc.length()-i-1)-'A']*Math.pow(n,i);
        }
        return sum;
    }

    // 剪去一些不必要的循环·m和i
    static boolean jianzhi(){
        if(b[numberm.charAt(0)-'A']+b[numbern.charAt(0)-'A'] >= n)//如果最高位需要进位
            return false;//剪枝
        for ( int j =n-1; j>=0; j++){
            int a1 = b[numbern.charAt(j)-'A'];
            int b1 = b[numberm.charAt(j)-'A'];
            int c1 = b[jieguo.charAt(j)-'A'];
            if (a1==-1||b1==-1||c1==-1) continue;
            if ((a1+b1)%n!=c1&&(a1+b1+1)%n!=c1){
                return false;
            }
        }
        return true;
    }

    static void dfs(int m){
        if (!jianzhi()){
            return;
        }
        if (m==n){
            if (zhi(b,numbern)+zhi(b,numberm)==zhi(b,jieguo)){
                for (int i = 0; i< n;i++){
                    System.out.print(b[i]+" ");
                }
                System.exit(0);
            }
            return;
        }
        for (int i =n-1; i>=0; i--){
            if (a[i] == 0){
                a[i] = 1;
                b[Next[m]] = i; // 结果集
                dfs(m+1);
                b[Next[m]] = -1;
                a[i] = 0;
            }
        }
    }
  static  void get_next(int n)//对于第n个字母
    {
        if(book[n] == false)//如果第n个字母还没有遍历到，就说明其出现的顺序比较靠后
        {
            book[n] = true;//标记一下
            Next[id] = n;//第n个字母在Next数组中的下标是id
            id++;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        n = scanner.nextInt();
        numbern = scanner.next();
        numberm = scanner.next();
        jieguo = scanner.next();
        for(int i = n-1; i >= 0; --i)//先垂直方向上从上到下，再 水平方向上从右到左
        {
            get_next(numbern.charAt(i)-'A');
            get_next(numberm.charAt(i)-'A');
            get_next(jieguo.charAt(i)-'A');
        }
        for (int i =0; i< n; i++)
              b[i] = -1;
        dfs(0);
    }
}
